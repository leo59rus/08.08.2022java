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
public class Cat {
    private String name;
    private int appetite;//скко хочет сЪесть
    private boolean ate;//сытый

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.ate = false;
    }

    public void info() {
        if (appetite == 0) {
            System.out.println(name + " наелся, сыт!");
        } else {
            System.out.println("кот по имени " + name + " голодный," +
                                       " ему необходимо " + appetite + " кусочков еды");
        }
    }

    public void eat(Plate plate) {
        if (appetite == 0){
            System.out.println(name + " не хочет кушать, тк не " +
                                       "голоден");
            return;
        }
        if (appetite < plate.getFood()) {
            plate.decreaseFood(appetite);
            ate = true;
            System.out.println(name + " покушал из тарелки");
            appetite = 0;
        } else{
            ate = false;
            System.out.println("коту по имени " + name + " не " +
                                       "хватило еды в тарелке");
        }
    }
}
