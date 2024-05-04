package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int [arr.length];

        for (int i = arr.length-1; i >= 0; i++) {
//            arr[i] = arr[arr.length-1];
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
