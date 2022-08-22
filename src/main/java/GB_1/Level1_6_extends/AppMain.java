package GB_1.Level1_6_extends;

import GB_1.Level1_6_extends.Animal.Animal;
import GB_1.Level1_6_extends.Animal.Cat;
import GB_1.Level1_6_extends.Animal.Cow;
import GB_1.Level1_6_extends.Animal.Dog;

public class AppMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Pushok", 2, 3),
                new Dog("Belka",2),
                new Cow("Dasha", 2)
        };
        for(Animal a : animals){
            a.voice();
        }
        System.out.println();

        System.out.println(animals[1]);//переопределил тостринг для
                                       // object

        System.out.println();

        Cat cat1 = new Cat("Barsik", 9, 12);
        cat1.info();
        cat1.jump();
        cat1.voice();

        Dog dog1 = new Dog("Baron", 12);
        dog1.info();
        dog1.jump();
        dog1.voice();

        Cow cow1 = new Cow("Buryonka", 3);
        cow1.info();
        cow1.jump();
        cow1.voice();

    }
}
