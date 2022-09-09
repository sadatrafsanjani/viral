package client;

import com.rafsan.disease.Disease;
import com.rafsan.disease.DiseaseRequest;
import com.rafsan.disease.DiseaseResponse;
import com.rafsan.disease.DiseaseServiceGrpc;
import io.grpc.Channel;
import java.util.List;


public class DiseaseClient {

    private DiseaseServiceGrpc.DiseaseServiceBlockingStub diseaseServiceBlockingStub;

    public DiseaseClient(Channel channel){

        diseaseServiceBlockingStub = DiseaseServiceGrpc.newBlockingStub(channel);
    }

    public List<Disease> getDiseases(int virusId){

        DiseaseRequest diseaseRequest = DiseaseRequest.newBuilder()
                .setVirusId(virusId)
                .build();

        DiseaseResponse diseaseResponse = diseaseServiceBlockingStub.getDiseasesForVirus(diseaseRequest);

        return diseaseResponse.getDiseaseList();
    }
}
