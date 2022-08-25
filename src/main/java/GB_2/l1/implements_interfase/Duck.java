package GB_2.l1.implements_interfase;

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
