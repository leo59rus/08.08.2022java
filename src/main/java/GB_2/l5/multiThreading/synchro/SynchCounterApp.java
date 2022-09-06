package GB_2.l5.multiThreading.synchro;

public class SynchCounterApp {
    public static void main(String[] args) throws InterruptedException {
        SynchCounter synchCounter = new SynchCounter();

        Thread incThread = new Thread(() -> {
            for (int i = 0; i <5000; i++) {
                synchCounter.inc();
            }
        });
        Thread decThread = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                synchCounter.dec();
            }
        });
        incThread.start();
        decThread.start();
        incThread.join();
        decThread.join();
        System.out.println(synchCounter.value());

    }
}
