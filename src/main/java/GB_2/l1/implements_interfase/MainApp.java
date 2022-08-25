package GB_2.l1.implements_interfase;

public class MainApp {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Baloon(),
                new Duck()
        };
        for (Flyable f : flyables) {
            f.fly();

        }
    }


}
