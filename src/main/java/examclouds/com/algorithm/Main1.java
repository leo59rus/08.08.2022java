package examclouds.com.algorithm;

public class Main1 {
    public static void main(String[] args) {
        double[] nums = {10.1, 11, 12.2, 13.2, 14};
        double result = 0;//заводим переменную

        for (double d : nums) {
            result += d;//к результ прибавляем все элементы массива
        }
       //делим сумму элементов на количество эл-тов
        System.out.println("среднее арифмитическое = " + result / nums.length);

        double[] myNums = {10, 20, 30, 40, 50};
        double myResult = 0;

        for(double x : myNums){
            myResult += x;
            System.out.println("myResult = " + myResult);
        }
        System.out.println("среднее арифмитическое myNums = " + myResult / myNums.length);
    }
}
