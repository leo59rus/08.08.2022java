package GB_2.l1.hw1;

public interface Sportsmens {
    int getJumpMax();
    int getRunMax();
    String getName();
    boolean isReady();

    void jump();
    void run();

    boolean setReady(boolean ready);
}
