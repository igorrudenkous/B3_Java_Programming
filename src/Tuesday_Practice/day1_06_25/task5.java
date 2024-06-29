package Tuesday_Practice.day1_06_25;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task #5

Create a method that solves the following task. And call it in the main method

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
it is necessary to output the maximum and  minimum value of the array.
 */
public class task5 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
        minMaxMethod(array);
    }


    public static void minMaxMethod (int [] array) {
       Arrays.sort(array);
       int min = array[0];
       int max = array[array.length - 1];
       System.out.println("min number is: " + min);
       System.out.println("max number is: " + max);
    }
}
