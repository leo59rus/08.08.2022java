package GB_2.l1.hw1;

public class Robot implements Sportsmens {
    private String name;
    private int jumpMax;
    private int runMax;
    private boolean ready;
    @Override
    public String toString() {
        return "Robot " + name;
    }

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

    public String getName() {
        return name;
    }


    public Robot(String model, int maxJump, int maxRun) {
        this.name = model;
        this.jumpMax = maxJump;
        this.runMax = maxRun;
        this.ready = true;
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
