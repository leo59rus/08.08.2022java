package Level1_5__get_set_constructor;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барон", "розовый", 8);
        Cat cat2 = new Cat("Рон", "лиловый", 4);

        System.out.println(cat.getAge());
        cat.setAge(10);
        System.out.println(cat.getAge());

        cat.info();
        cat.jump();

        cat2.info();
        cat2.jump();

        cat2.sleep();
        cat.sleep();
    }
}
