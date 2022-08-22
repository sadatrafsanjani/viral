package server;

public class ViralHook implements Runnable {

    @Override
    public void run() {
       new ViralServer().stop();
    }
}
