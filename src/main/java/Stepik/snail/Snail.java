package Stepik.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Улитка ползет вверх по вертикальному столбу высотой H
        // футов. За день он поднимается на A футов, а за ночь
        // опускается на B футов. В какой день улитка достигнет
        // вершины шеста?

        //На вход программа получает неотрицательные целые числа H,
        // A, B, где H > B и A > B. Каждое целое число не
        // превосходит 100.
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();//высота столба
        int a = scanner.nextInt();//поднимется в день
        int b = scanner.nextInt();//опускается за ночь
        int counter = 0;//счетчик
        while ((h-b) > 0) {//в цикле пока
            counter++;//cчетчик
            h = h - a + b;//из столба вычитаем прополз + скатился


        }
        System.out.println(counter);

    }

}
