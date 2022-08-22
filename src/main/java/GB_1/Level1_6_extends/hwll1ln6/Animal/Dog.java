package GB_1.Level1_6_extends.hwll1ln6.Animal;

public class Dog extends Animal{
    public Dog(String name, String color, int age, int runMax,
               int swimMax) {
        super(name, color, age, runMax, swimMax);
    }

    @Override
    public void run(int x) {
        if (x <= 500) {
            System.out.println("Dog " + getName() + " run " + x +
                                       " meters");
        } else {
            System.out.println("Dog " + getName() + " NO run " + x +
                                       " meters");
        }
    }

    @Override
    public void swim(int x) {
        if (x <= 10) {
            System.out.println("Dog " + getName() + " swim " + x +
                                       " meters");
        } else {
            System.out.println("Dog " + getName() + " NO swim " + x +
                                       " meters");
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