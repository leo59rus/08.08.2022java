package GB_2.l3_collection.hw;

import java.util.HashSet;

public class MainApp {
    public static void main(String[] args) {
        //Создать массив с набором слов (10-20 слов, должны
        // встречаться повторяющиеся). Найти и
        //вывести список уникальных слов, из которых состоит массив
        // (дубликаты не считаем).
        //Посчитать, сколько раз встречается каждое слово.
        HashSet<String> words = new HashSet<>();
        words.add("Rob");
        words.add("Bob");
        words.add("Hobby");
        words.add("Robin");
        words.add("Rob");
        words.add("Robin");
        words.add("Hobby");
        words.add("Bob");
        words.add("Rob");
        words.add("Hobby");
        words.add("Bob");
        System.out.println("кол-во уникальных слов: " + words.size() + "-> " + words);
    }
}
