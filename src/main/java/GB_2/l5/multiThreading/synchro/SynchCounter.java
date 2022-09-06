package GB_2.l5.multiThreading.synchro;

public class SynchCounter {
    private int c;
    public synchronized int value(){//synchronized означает что
        // потоки будут заходить в переменную поочереди для вызова
        // методов
        return c;
    }
    public synchronized void inc(){
        c++;
    }
    public synchronized void dec(){
        c--;
    }
}
