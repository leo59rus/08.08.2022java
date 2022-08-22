package GB_1.Level1_7_Strings_rpg.HW_1_7.CatPlate;
//1. Сделать так, чтобы в тарелке с едой не могло получиться
// отрицательного количества еды
//(например, в миске 10 еды, а кот пытается покушать 15-20).
//2. Каждому коту нужно добавить поле сытость (когда создаем котов,
// они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.
//3. Считаем, что если коту мало еды в тарелке, то он её просто не
// трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).
//4. Создать массив котов и тарелку с едой, попросить всех котов
// покушать из этой тарелки и
//потом вывести информацию о сытости котов в консоль.
//5. Добавить в тарелку метод, с помощью которого можно было бы
// добавлять еду в тарелку.
public class Plate {
    private String color;
    private int food;//колво еды
    private boolean complete;//полная

    public Plate(String color, int food) {
        this.color = color;
        this.food = food;
        this.complete = true;
    }

    public int getFood() {

        return food;
    }
    public void decreaseFood(int amount) {//уменьшение еды (колво)
        food -= amount;
    }

    public void info(){
        System.out.println("в тарелке " + color + " цвета " + food + " кусочков еды");
    }

    public void addFood(int amount){
        System.out.println("в тарелку " + color + " цвета положили " + amount + " кусочков еды");
        food += amount;
    }
}
