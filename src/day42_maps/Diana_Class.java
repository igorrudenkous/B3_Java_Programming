package day42_maps;

import java.sql.Array;
import java.util.Arrays;

public class Diana_Class {
    public static void main(String[] args) {
        int [] actual = {1, 2, 3, 4, 5, 6};
        int [] expected = {6, 5, 4, 3, 2, 1};

        reverseArray(actual);

        if (Arrays.equals(actual, expected)) {
            System.out.println("Actual is campare expected");
        } else {
            System.out.println("Actual is NOT campare expected");
        }
    }

    public static void reverseArray (int [] actual) {
        int leftIndex = 0;
        int rightIndex = actual.length - 1;
        while (leftIndex < rightIndex) {
            int temp = actual[leftIndex];
            actual[leftIndex] = actual[rightIndex];
            actual[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}
