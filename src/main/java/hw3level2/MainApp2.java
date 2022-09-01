package hw3level2;

import java.util.HashMap;
import java.util.HashSet;

//Написать простой класс Телефонный Справочник, который хранит в
// себе список фамилий и телефонных номеров. В этот телефонный
// справочник с помощью метода  add() можно
//добавлять записи, а с помощью метода get() искать номер телефона
// по фамилии. Следует учесть, что под одной фамилией может быть
// несколько телефонов (в случае однофамильцев), тогда при запросе
// такой фамилии должны выводиться все телефоны. Желательно не
// добавлять лишний функционал (дополнительные поля (имя, отчество,
// адрес),
// взаимодействие с пользователем через консоль и т.д). Консоль
// использовать только для вывода результатов проверки телефонного
//справочника.
public class MainApp2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("antomov", "58");
        phoneBook.add("antomov", "54");
        phoneBook.add("akishev", "55");
        phoneBook.add("tolik", "57");
        phoneBook.add("gogi", "77");
        phoneBook.add("harin", "765");
        phoneBook.add("holop", "763");
        phoneBook.add("gucci", "50");

        System.out.println(phoneBook.get("gucci"));
        System.out.println(phoneBook.get("antomov"));

    }
}

class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook =
            new HashMap<>();
    private HashSet<String> numberList;


    void add(String name, String number) {
        if (phoneBook.containsKey(name)) {//если есть уже имя
            numberList = phoneBook.get(name);
            numberList.add(number);
            phoneBook.put(name, numberList);
        } else {//если нет имени
            numberList = new HashSet<>();//создаём новый хашсет
            numberList.add(number);
            phoneBook.put(name, numberList);
        }
    }

    public HashSet<String> get(String surname) {
        return phoneBook.get(surname);
    }
}


