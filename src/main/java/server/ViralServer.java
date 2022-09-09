package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import service.VirusServiceImpl;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ViralServer {

    private Server server;

    public void start(){

        try {
            server = ServerBuilder
                    .forPort(50051)
                    .addService(new VirusServiceImpl())
                    .build()
                    .start();
            log.info("Virus Server Started...");
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }

        Runtime.getRuntime().addShutdownHook(new Thread(ViralServer.this::stop));
    }

    public void stop(){

        if(server != null){
            try {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public void blockUntilShutdown(){

        if(server != null){
            try {
                server.awaitTermination();
            } catch (InterruptedException e) {
                log.error(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args){

        ViralServer viralServer = new ViralServer();
        viralServer.start();
        viralServer.blockUntilShutdown();
    }
}
