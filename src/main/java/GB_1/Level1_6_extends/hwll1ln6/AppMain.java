package GB_1.Level1_6_extends.hwll1ln6;

import GB_1.Level1_6_extends.hwll1ln6.Animal.Animal;
import GB_1.Level1_6_extends.hwll1ln6.Animal.Cat;
import GB_1.Level1_6_extends.hwll1ln6.Animal.Dog;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра
// каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в
// консоль. (Например,
//dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200
// м., собака 500 м.; плавание:
//кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
public class AppMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Murzik", "black", 2, 150, 1),
                new Cat("Pushok", "white", 1, 205, 4),
                new Dog("Klyk", "gray", 2, 430, 7),
                new Dog("Strelok", "yelow", 2, 502, 125)
        };
        System.out.println("DISTANTION RUN!!");
        for (Animal a : animals) {
            a.run(a.getRunDistantion());
        }


        System.out.println();
        System.out.println("DISTANTION SWIM!!");
        for (Animal a : animals) {
            a.swim(a.getSwimDistantion());
        }

        System.out.println();
        int sportsmens = 0;
        for (Animal a : animals) {
            sportsmens += 1;
        }
        System.out.println("number of athletes: " + sportsmens);


    }
}
