package GB_1.Level1_6_extends.Animal;

public class Dog extends Animal {


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + " said GAF");
    }

    @Override
    public String toString() {
        return "Dog name: " + name + ", age: " + age;
    }

}
