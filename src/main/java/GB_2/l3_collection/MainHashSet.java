package GB_2.l3_collection;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("L");
        set.add("L");
        set.add("L");
        set.add("P");
        System.out.println(set.size());//3 тк все клоны в одной ячейке
        System.out.println(set);//в разнобой вставка


    }
}
