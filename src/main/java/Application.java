import server.DiseaseServer;
import server.ViralServer;

public class Application {

    public static void main(String[] args){

        ViralServer viralServer = new ViralServer();
        viralServer.start();
        viralServer.blockUntilShutdown();

        DiseaseServer diseaseServer = new DiseaseServer();
        diseaseServer.start();
        diseaseServer.blockUntilShutdown();
    }
}
