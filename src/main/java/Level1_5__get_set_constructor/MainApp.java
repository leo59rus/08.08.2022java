package Level1_5__get_set_constructor;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// считывание инфы напечатанной в консоль(System.in)
        int x = sc.nextInt();
        System.out.println(x);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барон", "розовый", 3);
        cats[1] = new Cat("Бар", "зовый", 5);
        System.out.println(Arrays.toString(cats));
        System.out.println(cats[0].getAge());//3


        Cat cat = new Cat("Барон", "розовый", 8);
        Cat cat2 = new Cat("Рон", "лиловый", 4);
        //создание массива
        Cat[] cats1 = {
                new Cat("Бон", "розовый", 8),
                new Cat("Gон", "лиловый", 4),
                new Cat("Gонfg", "hjлиловый", 4)
        };
//распечатка массива котов
        for (int i = 0; i < cats1.length; i++) {
            cats1[i].info();//Бон розовый 8
                            //Gон лиловый 4
                             //Gонfg hjлиловый 4
        }


        System.out.println(cat.getAge());//8
        cat.setAge(10);
        System.out.println(cat.getAge());//10

        cat.info();
        cat.jump();

        cat2.info();
        cat2.jump();

        cat2.sleep();
        cat.sleep();
    }
}
