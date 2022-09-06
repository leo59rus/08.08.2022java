package GB_2.l3_collection.hw;

import java.util.HashMap;
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
        System.out.println();
        //подсчет скко встретилось одно слово
        String[] array = {"Rob","Bob","Hobby","Robin","Rob","Robin"
                ,"Hobby","Bob","Rob","Hobby","Bob"};
        HashSet<String> set = new HashSet<>();
        for(String w:array){
            set.add(w);
        }
        System.out.println(set);
        for (String w:words){
            int count =0;
            for (int i = 0; i < array.length; i++) {
                if(w.equals(array[i])){//идем по массиву исходных слов
                    //если слово из сэта равно элту массива прибавь
                    // каунт
                    count++;
                }
            }
            System.out.println(w + " - " + count);//такое то слово
            // столько раз
        }

        System.out.println("подсчет слов чз мапу");

        HashMap<String, Integer> map = new HashMap<>();
        for (String word:array){//бежим по аррэй исходнику
            if(!map.containsKey(word)){//проверяем есть ли в мапе
                // такой ключ слово если нет
                map.put(word,1);//то добавляем с ключом 1
            }else{
                map.put(word, map.get(word) +1);//если есть то
                // значение увеличиваем на 1
            }
        }
        System.out.println(map);
    }
}
