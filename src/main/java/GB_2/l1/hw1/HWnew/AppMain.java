package GB_2.l1.hw1.HWnew;

public class AppMain {
    public static void main(String[] args) {
        Let[] lets = {
                new Road(), new Wall()
        };
        Sportsmens[] sp = {
                new Robot(), new Human()
        };

        for (Sportsmens s : sp) {
            for (Let l : lets) {
                l.go(s);
            }
        }
    }
}
