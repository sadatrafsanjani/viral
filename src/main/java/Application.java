import server.ViralServer;

public class Application {

    public static void main(String[] args){

        ViralServer viralServer = new ViralServer();
        viralServer.start();
        viralServer.blockUntilShutdown();
        System.out.println("Started...");
    }
}
