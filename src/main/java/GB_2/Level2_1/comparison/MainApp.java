package GB_2.Level2_1.comparison;

public class MainApp {
    public static void main(String[] args) {
        //создание объектов при вызове метода
        compare(new Box(12), new Box(10));
        compare(new Dinosaur(22), new Dinosaur(20));
        compare(new Block(2), new Block(3));
    }

    public static void compare(ObjComparble o1, ObjComparble o2) {
        if (o1.compare(o2) == 1 || o1.compare(o2) == 0) {
            System.out.println("o1 >= o2");
        } else {
            System.out.println("o1 < o2");
        }
    }

}
