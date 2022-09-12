package GB_2.l5.multiThreading.synchro.monitor;

public class SynchDoubleCounter {
    private int c1 = 0;
    private int c2 = 0;

//создаём мониторы для каждого потока класса обжект
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public int value1(){
        synchronized (monitor1){
            return c1;
        }
    }

    public int value2(){
        synchronized (monitor2){
            return c2;
        }
    }

    public void inc1(){
        synchronized (monitor1){
            c1++;
        }
    }

    public void inc2(){
        synchronized (monitor2){
            c2++;
        }
    }

    public void dec1(){
        synchronized (monitor1){
            c1--;
        }
    }

    public void dec2(){
        synchronized (monitor2){
            c2--;
        }
    }
}
