package my_utilitis;

import java.util.Arrays;

public class ArrayUtil {
// search and returns MIN number from array
    public static int minNumInSortArray (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

// search and returns MAX number from array
    public static int maxNumInSortArray (int [] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

//this method cheks contains number in array
    public static boolean containsNumInArray (int [] arr, int num) {
        for (int eachNum : arr) {
            if (eachNum == num) {
                return true;
            }
        }
        return false;
    }
}
