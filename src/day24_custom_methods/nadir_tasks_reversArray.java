package day24_custom_methods;

import java.util.Arrays;

public class nadir_tasks_reversArray {
    public static void main(String[] args) {
    int [] numbers = {1, 2, 4, 5 ,5};
    int [] numbers2 = new int [numbers.length];


        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            numbers2[(numbers.length-1)-i] = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

    }

}

