package GB_2.Level2_1.ENUMeration;

public class MainApp {
    public static void main(String[] args) {
        Month month8 = Month.AUGUST;
        System.out.println(month8.getIndex());



        //cлучайный месяц
        Month randomMonth =
                Month.values()[(int)(Math.random() * Month.values().length)];
        System.out.println(randomMonth);
    }
}
