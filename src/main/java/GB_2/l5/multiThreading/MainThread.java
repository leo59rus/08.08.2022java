package GB_2.l5.multiThreading;

public class MainThread {
    public static void main(String[] args) throws Exception {
        //в каком потоке работа
        System.out.println(Thread.currentThread());//майн
        //  AppThread appThread1 = new AppThread();
        //  AppThread appThread2 = new AppThread();
        //  appThread1.start();
        //  appThread2.start();

        //это лучше для многопоточности
        // Thread thread1 = new Thread(new AppRunnable());
        // Thread thread2 = new Thread(new AppRunnable());
        // thread1.start();
        // thread2.start();

        //без создания классов
        //создание анонимного внутреннего класса
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i);
            }
        });
        thread.start();
        thread.join();
        System.out.println("End");//будет первым при вызове
        // многопоточности если перед ним не вызвать метод джойн у
        // потока
    }
}
