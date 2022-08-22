package service;

import com.rafsan.virus.VirusRequest;
import com.rafsan.virus.VirusResponse;
import com.rafsan.virus.VirusServiceGrpc;
import entity.Virus;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import model.VirusModel;

@Slf4j
public class VirusServiceImpl extends VirusServiceGrpc.VirusServiceImplBase {

    private VirusModel virusModel = new VirusModel();

    public void getVirus(VirusRequest request, StreamObserver<VirusResponse> responseObserver){

        Virus virus = virusModel.getById(request.getId());

        VirusResponse response = VirusResponse
                .newBuilder()
                .setId(virus.getId())
                .setName(virus.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
