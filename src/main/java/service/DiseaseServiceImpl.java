package service;

import com.rafsan.disease.Disease;
import com.rafsan.disease.DiseaseRequest;
import com.rafsan.disease.DiseaseResponse;
import com.rafsan.disease.DiseaseServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import model.DiseaseModel;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DiseaseServiceImpl extends DiseaseServiceGrpc.DiseaseServiceImplBase {

    private DiseaseModel diseaseModel = new DiseaseModel();

    public void getDiseasesForVirus(DiseaseRequest request, StreamObserver<DiseaseResponse> responseObserver){

        List<Disease> diseaseList = diseaseModel.getDiseasesByVirusId(request.getId()).stream().map(
                disease ->
                        Disease.newBuilder()
                                .setId(disease.getId())
                                .setName(disease.getName())
                                .setVirusId(disease.getVirus().getId())
                                .setFatality(disease.getFatality())
                                .build())
                .collect(Collectors.toList());

        DiseaseResponse response = DiseaseResponse.newBuilder()
                .addAllDisease(diseaseList)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
