package Tuesday_Practice.day1_06_25;

import java.util.Arrays;

/*
Create a method that solves the following task. And call it in the main method:

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
it is necessary to output all odd numbers from the array.
 */
public class task1 {
    public static void main(String[] args) {
        int [] arrayNew = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        eachOdd(arrayNew);

    }

    public static void eachOdd (int [] array) {
        for (int eachNum : array) {
            if (eachNum % 2 != 0) {
                System.out.println(eachNum);
            }
        }
    }
}
