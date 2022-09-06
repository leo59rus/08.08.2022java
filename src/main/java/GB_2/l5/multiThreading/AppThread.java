package GB_2.l5.multiThreading;

public class AppThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}
