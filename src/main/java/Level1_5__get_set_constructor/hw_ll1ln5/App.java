package Level1_5__get_set_constructor.hw_ll1ln5;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email,
// телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании
// объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит
// информацию об объекте в
//консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив
// объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer",
// "ivivan@mailbox.com", "892312312",
//30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//5. С помощью цикла вывести информацию только о сотрудниках старше
// 40 лет.
public class App {
    public static void main(String[] args) {


        Employee[] employees = {
                new Employee("виталий Андреевич", "директор", "ffull" +
                        "@mail.ru", "89885255961", 100000,
                             50),
                new Employee("Генадий петрович", "со-директор", "fhjull" +
                        "@mail.ru", "89884255961", 90000,
                             30),
                new Employee("Арсен арсенович", "директор уборщиков",
                             "floull@mail.ru", "88585255961",
                             80000, 22),
                new Employee("Пит Иванов", "старший уборщик", "fulhhl" +
                        "@mail.ru", "88885255961", 40000,
                             23),
                new Employee("Джастин котов", "уборщик", "fuukloll@mail" +
                        ".ru", "89885255856", 5000, 47)
        };

        for (Employee emcorp:employees) {
            if(emcorp.getAge() > 40 && emcorp.getSalary() > 90000){
                emcorp.info();
            }
        }

    }
}
