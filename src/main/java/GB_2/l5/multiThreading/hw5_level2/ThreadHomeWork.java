package GB_2.l5.multiThreading.hw5_level2;

import java.util.Arrays;

public class ThreadHomeWork {
    public static void main(String[] args) throws Exception {
      //  long startTime = System.currentTimeMillis();
        firstMethod();
        secondMethod();
       // System.out.println("total time: " + (System
        // .currentTimeMillis() - startTime) + " ms.");

    }

    private static void firstMethod() {
        int size = 10_000_000;//размер для массива
        float[] arr = new float[size];//создание массива с размеом
        // сайз

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;//пробежали по массиву и всавили 1.0
        }

        long startTime = System.currentTimeMillis();//засекли время
        for (int i = 0; i < arr.length; i++) {
            arr[i] =
                    (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                            Math.cos(0.4f + i / 2));//каждый эл
            // массиыва
            // переименовали по формуле с метдчки

        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        //время окончания минус время старта
    }

    private static void secondMethod() {
        int size = 10_000_000;//размер для массива
        float[] arr1 = new float[size];//создание массива с размеом
        // сайз

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;//пробежали по массиву и всавили 1.0
        }

        long startTime = System.currentTimeMillis();//засекли время
        //создали для заполнения
        float[] leftArr = new float[5_000_000];
        float[] rightArr = new float[5_000_000];
        //копируем исходник в два массива
        System.arraycopy(arr1, 0, leftArr, 0, 5_000_000);
        System.arraycopy(arr1, 0, rightArr, 0, 5_000_000);


        Thread thread = new Thread(() -> {
            for (int i = 0; i < leftArr.length; i++) {
                leftArr[i] =
                        (float) (leftArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                                Math.cos(0.4f + i / 2));

            }
        });
        thread.start();


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < rightArr.length; i++) {
                rightArr[i] =
                        (float) (rightArr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                                Math.cos(0.4f + i / 2));
            }
        });
        thread2.start();

        //создаем массив для копирования кусков
        float[] arr2 = new float[10_000_000];
        //копируем куски в целый массив
        System.arraycopy(leftArr, 0, arr2, 0, 5_000_000);
        System.arraycopy(rightArr, 0, arr2, 5_000_000, 5_000_000);

        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        //время окончания минус время старта
        //*время разделения и склейки массива 65мс
    }
}
