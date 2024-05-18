package day22_arrays_continuation;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {1, 2, 3, 4};
        int [] arr3 = arr1;

        System.out.println(arr1 == arr2); //DO NOT USE == to compare arrays
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1 == arr3);

        int [] arr4 = {4, 3, 2, 1};
        System.out.println(Arrays.equals(arr1, arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr1, arr4));

    }
}
