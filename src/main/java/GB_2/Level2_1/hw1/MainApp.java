package GB_2.Level2_1.hw1;

//1. Создайте три класса Человек, Кот, Робот, которые не
// наследуются от одного класса. Эти
//классы должны уметь бегать и прыгать (методы просто выводят
// информацию о действии в
//консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении
// через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и
// заставьте всех участников пройти
//этот набор препятствий.
//4. * У препятствий есть длина (для дорожки) или высота (для
// стены), а участников ограничения
//на бег и прыжки. Если участник не смог пройти одно из
// препятствий, то дальше по списку он
//препятствий не идет.
public class MainApp {
    public static void main(String[] args) {
        Sportsmens[] sportsmens = {
                new Robot("R1", 40, 18),
                new Robot("R2", 80, 80),
                new Human("petr", 120, 85),
                new Human("lev", 95, 55)
        };
        Let[] lets = {
                new Road(50),
                new Wall(50)
        };
        for (Sportsmens s : sportsmens) {
            //цикл для участников
            for (Let l : lets) {
                l.overcome(s);
                System.out.println();
            }

        }
        for(Sportsmens s : sportsmens){
            if(s.isReady() == true){
                System.out.println("добежали до финиша " + s.toString());
            }
        }
    }
}
