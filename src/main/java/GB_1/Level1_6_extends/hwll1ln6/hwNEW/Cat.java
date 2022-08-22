package GB_1.Level1_6_extends.hwll1ln6.hwNEW;

public class Cat extends Animal {
    public static int catsCount;//для счетчика вызова
    // конструктора и нахождения колва котов
    public Cat(String name) {
        this.type = "КОШАРА";
        this.name = name;
        this.swimMaxDistance = 0;
        this.runMaxDistance = 200;
        catsCount++;//увеличиваем счётчик при вызове конструктора
    }




}
