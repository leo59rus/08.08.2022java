package GB_1.Level1_7_Strings_rpg.CatEatFood;

public class MainApp2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Plate plate1 = new Plate(50);//создали тарелку с 50ю кусками
        // еды
        cat1.info();
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        cat1.info();
        cat1.eat(plate1);
        plate1.info();
    }
}
