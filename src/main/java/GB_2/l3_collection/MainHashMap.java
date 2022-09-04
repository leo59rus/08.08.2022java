package GB_2.l3_collection;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        //<для ключа, для значения>
        HashMap<String, String> map = new HashMap<>();
        map.put("rus", "Mosc");//кладём
        map.put("Britain", "Lond");
        map.put("France","Paris");
        System.out.println(map.get("France"));//paris
    }
}
