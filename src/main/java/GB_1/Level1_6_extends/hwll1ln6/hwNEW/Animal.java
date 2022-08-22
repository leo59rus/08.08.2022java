package GB_1.Level1_6_extends.hwll1ln6.hwNEW;

public abstract class Animal {
    public static int animalsCount;//для счетчика вызова
    // конструктора и нахождения колва животных
    String type;
    String name;
    int swimMaxDistance;
    int runMaxDistance;
public Animal(){
    animalsCount++;//увеличиваем счётчик при вызове конструктора
}



    public void run(int distance) {
        if (distance > runMaxDistance) {
            System.out.println(type + " " + name + " не пробежал " +
                                       "дистнацию бега");
        } else {
            System.out.println(type + " " + name + " смог преодалеть " +
                                       "дистнацию " + "бега");
        }
    }

    public void swim(int distance) {
        if(swimMaxDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;//останвливаем метод
        }
        if(distance > swimMaxDistance) {
            System.out.println(type + " " + name + " не проплыл дистнацию " +
                                       "плавания");
        } else {
            System.out.println(type + " " + name + " смог " +
                                       "преодалеть дистнацию " +
                                       "плавания");
        }
    }


}
