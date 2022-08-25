package GB_2.l1.hw1;

public class Human implements Sportsmens {
    private String name;
    private int jumpMax;
    private int runMax;
    private boolean ready;

    @Override
    public String toString() {
        return "Human " + name;
    }

    public Human(String name, int jumpMax, int runMax) {
        this.name = name;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
        this.ready = true;
    }
@Override
    public boolean isReady() {
        return ready;
    }
    @Override
    public boolean setReady(boolean ready) {
        this.ready = ready;
        return ready;
    }



    @Override
    public int getJumpMax() {
        return jumpMax;
    }

    @Override
    public int getRunMax() {
        return runMax;
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public void run() {
        System.out.println(name + " вышел на дистанцию бега");
    }


    @Override
    public void jump() {
        System.out.println(name + " бежит на стену для прыжка");
    }
}
