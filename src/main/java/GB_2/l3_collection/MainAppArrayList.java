package GB_2.l3_collection;

import java.util.ArrayList;

public class MainAppArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("list" + list);
        list.add("A");
        list.add("B");
        list.add("C");
        for (int i = 0; i < 2; i++) {
            list.add("23");

        }
        System.out.println("list " + list);
        System.out.println("list 2 index " + list.get(2));//вторй
        // индекс покажи
        System.out.println("list size " + list.size());//size
        System.out.println("list contains A " + list.contains("A"));
        //булиан есть ли
        // такой элемент
        System.out.println("list contains af " + list.contains("AФ"));
        list.add(2, "e");//вставка элемента во 2ю ячеку и смещение
        // остальных на один вправо

        list.remove(2);//удаление со 2й ячейки элемента и смещение
        // элов влево (пустых мест не бывает)
        list.remove("A"); //удаление объекта который первый найдет
        System.out.println("this" + list);
        list.set(2, "you");//замена символа по индексу
        System.out.println("this" + list);
        list.add("23");
        System.out.println("this" + list);
        while (list.remove("23"));//удаление всех этих элементов
        System.out.println("this 23? " + list);
        System.out.println();

        //для хранения цифр
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(455);
        ints.add(455);
        ints.add(455);
        ints.add(455);
        System.out.println("ints " + ints);
        System.out.println();


        //хоть что положить котов,цифры, строки
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(0);
        objects.add(0);
        objects.add("ffef");
        System.out.println("objects " + objects);

        System.out.println();
        ArrayList<String> mln = new ArrayList<>(9000000);//задали
        // размер чтобы не тратить память на 1.5 умножение массива
        // если знаем что лист будет такой величины
        for (int i = 0; i < 9000000; i++) {
            mln.add("lol kek 4ebureK");
        }
        System.out.println(mln);
    }
}
