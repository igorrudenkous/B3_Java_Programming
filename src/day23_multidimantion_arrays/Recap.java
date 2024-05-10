package day23_multidimantion_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr1 = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 90, 60};


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Compare before sorttime: " + Arrays.equals(arr1, arr2));


        String [] words = {"java", "selenium", "api"};

        System.out.println(String.join("###", words));
    }
}
