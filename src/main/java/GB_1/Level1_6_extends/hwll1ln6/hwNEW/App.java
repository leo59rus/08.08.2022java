package GB_1.Level1_6_extends.hwll1ln6.hwNEW;

import static GB_1.Level1_6_extends.hwll1ln6.hwNEW.Animal.animalsCount;

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
public class App {
    public static void main(String[] args) {

        Animal[] athletics = {
                new Dog("Strelok"),
                new Dog("StrelkA"),
                new Dog("Street"),
                new Dog("Strei4"),
                new Cat("PI"),
                new Cat("PIter"),
                new Cat("Pon4ik"),
        };
        for (Animal a : athletics) {
            a.swim(29);
            a.run(58);
        }

        System.out.println(animalsCount);
    }
}
