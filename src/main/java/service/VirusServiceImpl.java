package service;

import client.DiseaseClient;
import com.rafsan.disease.Disease;
import com.rafsan.virus.VirusRequest;
import com.rafsan.virus.VirusResponse;
import com.rafsan.virus.VirusServiceGrpc;
import entity.Virus;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import dao.VirusDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class VirusServiceImpl extends VirusServiceGrpc.VirusServiceImplBase {

    private VirusDao virusDao = new VirusDao();

    public void getVirus(VirusRequest request, StreamObserver<VirusResponse> responseObserver) {

        Virus virus = virusDao.getById(request.getId());

        VirusResponse.Builder virusResponseBuilder = VirusResponse
                .newBuilder()
                .setId(virus.getId())
                .setName(virus.getName());

        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:50052")
                .usePlaintext().build();

        DiseaseClient diseaseClient = new DiseaseClient(channel);

        List<Disease> diseases = diseaseClient.getDiseases(virusResponseBuilder.getId());

        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("Could not shut down channel: {}", e.getMessage());
            throw new RuntimeException(e);
        }

        virusResponseBuilder.setNoOfDiseases(diseases.size());
        VirusResponse response = virusResponseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
