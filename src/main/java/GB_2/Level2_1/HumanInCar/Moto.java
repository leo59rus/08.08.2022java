package GB_2.Level2_1.HumanInCar;

public class Moto implements Transport{
    private String model;


    public Moto(String model) {
        this.model = model;
    }

    public void ride(String name){

        System.out.println("мотоцикл поехал под управлением " + name);
    }
    public void stop(){
        System.out.println("мотоцикл остановился");
    }

}
