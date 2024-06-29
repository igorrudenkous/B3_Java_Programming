package Tuesday_Practice.day1_06_25;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a method that solves the following task. And call it in the main method Remove Duplicates from an Array
    •    Write a method to remove duplicate elements from an array.
    •    Example: Input: [1, 2, 2, 3, 4, 4, 5], Output: [1, 2, 3, 4, 5].
 */
public class task6 {
    public static void main(String[] args) {
        int [] array = {1, 2, 2, 3, 4, 4, 5, 2};
        System.out.println(nonDublicate(array));

    }

    public static ArrayList <Integer> nonDublicate (int [] array) {
        ArrayList <Integer> list1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
                if (!list1.contains(array[i])) {
                    list1.add(i);
                }
            }
        return list1;
    }
}
