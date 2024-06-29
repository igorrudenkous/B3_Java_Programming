package Tuesday_Practice.day1_06_25;

import java.util.ArrayList;

/*
Create a method that solves the following task. And call it in the main method

An array is given:
int[] array = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
it is necessary to output the sum of all values of the array.
 */
public class task4 {
    public static void main(String[] args) {
        int[] arrayNew = {9, 2, 6, 4, 5, 12, 7, 7, 8, 6};
        System.out.println(eachOdd(arrayNew));
    }


    public static int eachOdd(int[] array) {
        int sum = 0;
        for (int eachNum : array) {
            sum += eachNum;
        }
        return sum;
    }
}


