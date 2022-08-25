package GB_2.l3_collection;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[10];
        System.arraycopy(arr,0,arr2,0,arr.length);//какой массив, с
        // какой ячейки, в какой массив, с какой ячейки вставлять,
        // какую длину)
        System.out.println(Arrays.toString(arr2));
    }
}
