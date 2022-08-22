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
                    .forPort(5000)
                    .addService(new VirusServiceImpl())
                    .build()
                    .start();
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }

        Runtime.getRuntime().addShutdownHook(new Thread(new ViralHook()));
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
}
