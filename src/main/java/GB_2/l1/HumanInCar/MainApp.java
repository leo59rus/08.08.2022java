package GB_2.l1.HumanInCar;

public class MainApp {
    public static void main(String[] args) {
        Human man = new Human("Vitalya");
        Moto mot = new Moto("Harley");
        Car car = new Car("Tesla");


        man.ride(car);
        System.out.println();
        man.ride(mot);
        System.out.println();

        man.stop();
        System.out.println();

        man.stop();
        System.out.println();

        man.ride(mot);
        System.out.println();

        man.ride(car);
        System.out.println();

        man.stop();



    }
}
