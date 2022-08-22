package GB_1.Level1_7_Strings_rpg.ToyInBox;

public class MainApp {
    public static void main(String[] args) {
        ToyBox toyBox = new ToyBox();
        Toy teddyBear = new Toy("Teddy Bear");
        Toy car = new Toy("Pikap car");
        toyBox.info();
        toyBox.putToy(teddyBear);
        toyBox.info();
        toyBox.close();
        toyBox.info();
        toyBox.open();
        toyBox.info();
        toyBox.close();
        toyBox.putAwayToy();
        toyBox.info();

        toyBox.putToy(car);
        toyBox.open();
        toyBox.info();
        toyBox.putAwayToy();
        toyBox.info();
        toyBox.putToy(car);
        toyBox.info();


    }
}
