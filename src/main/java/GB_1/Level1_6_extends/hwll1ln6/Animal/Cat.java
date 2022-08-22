package GB_1.Level1_6_extends.hwll1ln6.Animal;

public class Cat extends Animal {

    public Cat(String name, String color, int age, int runMax,
               int swimMax) {
        super(name, color, age, runMax, swimMax);
    }

    @Override
    public void run(int x) {
        if (x <= 200) {
            System.out.println("Cat " + getName() + " run " + x +
                                       " meters");

        } else {
            System.out.println("Cat " + getName() + " NO run " + x +
                                       " meters");
        }
    }

    @Override
    public void swim(int x) {
        if (x <= 0) {
            System.out.println("Cat " + getName() + " swim " + x +
                                       " meters");
        } else {
            System.out.println("Cat " + getName() + " NO swim!!");
        }
    }
}
//2. Все животные могут бежать и плыть. В качестве параметра
// каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в
// консоль. (Например,
//dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200
// м., собака 500 м.; плавание:
//кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.