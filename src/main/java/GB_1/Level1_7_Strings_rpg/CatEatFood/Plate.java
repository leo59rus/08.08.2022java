package GB_1.Level1_7_Strings_rpg.CatEatFood;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

    public void decreaseFood(int amount) {//уменьшение еды (колво)
        food -= amount;

    }
}
