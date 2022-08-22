package GB_1.Level1_7_Strings_rpg.CatEatFood;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;//голодный

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;//за один подход к тарелке съест 5 кусков
        // еды и становится сытым не голодным
        this.hungry = true;//да, голодный изначально
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println(name + ", голодный? - " + hungry);
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);
        hungry = false;
        System.out.println(name + " покушал из тарелки");
    }
}
