package GB_2.Level2_2;

public class AppMain {
    public static void main(String[] args) {
        System.out.println(sqrt(5));
    }
    public static int sqrt(int number){
        if(number < 0 ){
            throw new ArithmeticException("корня из отрицательного " +
                                                  "числа не " +
                                                  "существует " +
                                                  "разбирайся сам");
        }
        return number/2;
    }
}
