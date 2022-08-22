package GB_1.random;

public class Random {
    public static void main(String[] args) {
        int r;
        int round = 1;
        do {
            System.out.println("попытка номер " + round);
            r = (int)(Math.random() * 10) + 1;//от 1 до 10
            //тут можно эксперементировать
            System.out.println(r);
            round++;
        } while (r != 0);//нет конца
        //вывод: Math.random() от 0 до 1)не включая 1
    }
}
//(int)(Matn.random() * 10) + 1