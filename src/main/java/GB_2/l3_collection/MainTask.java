package GB_2.l3_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainTask {
    public static void main(String[] args) {
        String[] words = {"Sheep", "Java", "Earth", "Fire", "Door" +
                "Linux", "Data", "Idea", "Bread", "Milk", "Zoo",
                "Animal", "Cat", "Dog","Science","Astronomy", "Star", "Cafe"};

        //разложим на первую букву слова
        HashMap<Character, Set<String>> encyclopedia = new HashMap<>();

        for(String w:words){//бежим по массиву вордс
            Character firstChar = w.charAt(0);//присваиваем
            // фирстчару 0ю ячейку те первую букву слова

            encyclopedia.put(firstChar, new HashSet<>());//в хэшмап
            // энциклопедии закаладывем на ключ первой
            // буквы/символа значение new HashSet<>()

            encyclopedia.get(firstChar).add(w);//энциклопедиа дай
            // мне первый симвло ключ и положи туда это слово
            // начинющееся на этот символ букву

        }


        System.out.println(encyclopedia);

    }
}
