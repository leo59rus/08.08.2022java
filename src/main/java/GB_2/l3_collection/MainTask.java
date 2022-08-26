package GB_2.l3_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainTask {
    public static void main(String[] args) {
        String[] words = {"Sheep", "Java", "Earth", "Fire", "Door" +
                "Linux", "Data", "Idea", "Bread", "Milk", "Zoo",
                "Animal", "Cat", "Dog", "Science", "Astronomy", "Star", "Cafe"};

        //разложим на первую букву слова
        HashMap<Character, HashSet<String>> encyclopedia =
                new HashMap<>();

        for (String word : words) {//бежим по массиву вордс
            Character firstChar = word.charAt(0);//присваиваем
            // фирстчару 0ю ячейку те первую букву слова

            if (!encyclopedia.containsKey(firstChar)) {//если ключа
                // такого ещё нет, то создаём новый ключ пустой,
                // если есть то кладем в него значение

                encyclopedia.put(firstChar, new HashSet<>());//в хэшмап
                // энциклопедии закаладывем на ключ первой
                // буквы/символа новое значение new HashSet<>()
            }
            encyclopedia.get(firstChar).add(word);//энциклопедиа дай
            // мне первый симвло ключ и положи туда это слово
            // начинющееся на этот символ букву





        }
        System.out.println(encyclopedia);//весь список побуквенно
        System.out.println(encyclopedia.get('A'));//список под
        // ключом А
    }
}
