package GB_1.Level1_5_get_set_constructor.hw_ll1ln5.hwSam;
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
          new Employee(24, "Billy", "Boss"),
          new Employee(76, "Donny", "clean-man"),
          new Employee(6, "Don", "clean-man"),
          new Employee(46, "Dorati", "clean-man")
        };

        for (Employee emp : employees) {
            if(emp.getAge() > 45){//emp - временная переменная
                // сотрудника только в цикл, каждый раз он
                // переходит на следующего пока не закончаться
                // сотрудники
                emp.info();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() < 45){
                System.out.println("молодой");
                employees[i].info();
            }
        }
    }
}
