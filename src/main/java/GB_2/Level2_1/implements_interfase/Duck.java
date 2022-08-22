package GB_2.Level2_1.implements_interfase;

public class Duck implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("утка летит");
    }

    @Override
    public void swim() {
        System.out.println("утка плывёт");
    }
}
