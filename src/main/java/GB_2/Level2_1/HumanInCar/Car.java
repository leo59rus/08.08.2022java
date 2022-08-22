package GB_2.Level2_1.HumanInCar;

public class Car implements Transport{
    private String model;


    public Car(String model) {
        this.model = model;
    }



    @Override
    public void ride(String name){
        System.out.println("машина поехала под управлением " + name);
    }



    public void stop(){
        System.out.println("машина остановилась");
    }


}
