package day21_arrays;

import java.util.Arrays;

public class primitiveSample {
    public static void main(String[] args) {
        double [] arr = new double[4];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        arr [0] = 30.99;

        System.out.println(Arrays.toString(arr));

        double price = 1.99;
        int quantity = 5;

        arr [1] = price * quantity;
        System.out.println(Arrays.toString(arr));

        arr [2] = 11.99;
        arr [3] = 50;



        System.out.println(Arrays.toString(arr));
    }
}
