package GB_2.Level2_2;

public class MainApp {
    public static void main(String[] args) {

        int x = Integer.parseInt("1235");//текст переобразуем в число
        x++;
        System.out.println(x);

        System.out.println(1);
        try {
            System.out.println(2);
            int b = 10 / 0;
            System.out.println(3);//не вызывется после отловленной
            // ошибки

        } catch (ArithmeticException b) {
            b.printStackTrace();//опимание стэк вызовов ошибки в
            // консоль можно не писать
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(4);
    }
}
