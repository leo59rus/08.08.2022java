package GB_2.l5.multiThreading.hw5_level2;

import java.util.Arrays;

public class SplitAndMergedArrayTest {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5, 6};//создали массив

        System.out.println(Arrays.toString(initialArray));
        //распечатали

        int[] leftHalf = new int[3];//создали два массива пустых
        // равные 1/2 размера начального массива
        int[] rightHalf = new int[3];


        System.arraycopy(initialArray, 0, leftHalf, 0, 3);
        //копирование(название с какого копируем, с какой ячейки
        // копируем(0),
        // новое название созданного(leftHalf)массива,с какой
        // ячейки вставляем , длина)
        System.arraycopy(initialArray, 3, rightHalf, 0, 3);

        //выводим созданные куски
        System.out.println(Arrays.toString(leftHalf));
        System.out.println(Arrays.toString(rightHalf));

        //склейка
        //создаем массив размером 1/2 + 1/2
        int[] mergedArray = new int[6];
        //копируем
        System.arraycopy(leftHalf, 0, mergedArray, 0, 3);
        System.arraycopy(rightHalf, 0, mergedArray, 3, 3);
        //выводим
        System.out.println(Arrays.toString(mergedArray));
    }
}
