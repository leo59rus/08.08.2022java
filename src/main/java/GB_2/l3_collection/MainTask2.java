package GB_2.l3_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainTask2 {
    public static void main(String[] args) {
        String[] words = {"Sheep", "Java", "Earth", "Fire", "Door",
                "Linux", "Data", "Idea", "Bread", "Milk", "Zoo",
                "Animal", "Cat", "Dog", "Science", "Astronomy",
                "Star", "Cafe"};

        //узнаем длину каждого слова
        HashMap<String, Integer> lengthWord = new HashMap<>();

        for (String word : words) {//бежим по массиву вордс
            lengthWord.put(word, word.length());//вставляем в ключ
            // слово,
            // в значение его длину
        }


        System.out.println(lengthWord);//{Java=4, Cafe=4,
        // Science=7, DoorLinux=9, Data=4, Bread=5, Earth=5,
        // Idea=4, Star=4, Animal=6, Fire=4, Cat=3, Sheep=5, Zoo=3,
        // Dog=3, Astronomy=9, Milk=4}
        System.out.println(lengthWord.get("Linux"));//5

    }
}
