package GB_2.l3_collection.hwNew;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    private HashMap<String, HashSet<String>> map;

    public Phonebook(HashMap<String, HashSet<String>> map) {
        this.map = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!map.containsKey(surname)) {//нет фамилии
            map.put(surname, new HashSet<>());//создай новый сет с
            // этой фамилией
        }
        map.get(surname).add(phone);//есть фымилия добавь в сет с
        // этой фамилией номер еще один
    }
    public HashSet<String> get(String surname){
        return map.get(surname);
    }

}
