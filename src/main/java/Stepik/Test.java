package Stepik;
import java.util.Scanner;
class TestBest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tS = scanner.nextInt();
        int s = tS%60;
        int m = tS/60%60;
        int h = tS/3600%24;
        System.out.printf("%d" +":"+ "%02d"+":" +"%02d", h,m,s);  }
}
