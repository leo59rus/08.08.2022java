package GB_1.Level1_6_extends.Animal;

public class Cat extends Animal {
    int clawsLengths;//длина когтей

    public Cat(String name, int age, int clawsLengths) {
        this.name = name;
        this.age = age;
        this.clawsLengths = clawsLengths;
    }

    @Override
    public void voice() {
        System.out.println(name + " said MEOW");
    }

    @Override
    public void info() {
        super.info();//вызов метода родителя
        System.out.println("cat name: " + name + " age: " + age +
                                   " claws lengths = " + clawsLengths);
    }

}
