package GB_1.Level1_6_extends.hwll1ln6.Animal;
//2. Все животные могут бежать и плыть. В качестве параметра
// каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в
// консоль. (Например,
//dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200
// м., собака 500 м.; плавание:
//кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
public abstract class Animal {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public int getRunDistantion() {
        return runDistantion;
    }

    public int getSwimDistantion() {
        return swimDistantion;
    }

    private int age;
    private int runDistantion;
    private int swimDistantion;

    public Animal(String name, String color, int age, int runDistantion,
                  int swimDistantion) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistantion = runDistantion;
        this.swimDistantion = swimDistantion;
    }

    public abstract void run(int x);

    public abstract void swim(int x);

}
