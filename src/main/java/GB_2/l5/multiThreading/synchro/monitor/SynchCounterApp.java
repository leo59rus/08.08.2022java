package GB_2.l5.multiThreading.synchro.monitor;




public class SynchCounterApp {
    public static void main(String[] args) throws InterruptedException {
        NotCorrectSynchDoubleCounter synchCounter =
                new NotCorrectSynchDoubleCounter();

        Thread inc1Thread = new Thread(() -> {
            for (int i = 0; i <4000; i++) {
                synchCounter.inc1();
            }
        });
        Thread dec1Thread = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                synchCounter.dec1();
            }
        });

        Thread inc2Thread = new Thread(() -> {
            for (int i = 0; i <5000; i++) {
                synchCounter.inc2();
            }
        });
        Thread dec2Thread = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                synchCounter.dec2();
            }
        });
        inc1Thread.start();
        dec1Thread.start();
        inc1Thread.join();
        dec1Thread.join();

        inc2Thread.start();
        dec2Thread.start();
        inc2Thread.join();
        dec2Thread.join();

        System.out.println("value1 = " + synchCounter.value1());
        System.out.println("value2 = " + synchCounter.value2());

    }
}
