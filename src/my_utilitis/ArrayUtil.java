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

//  this method accept array int [] and some number and returns new [] with this number
    public static int [] addElementInArray (int [] origArr, int elementToAdd) {

        int [] newArr = Arrays.copyOf(origArr, origArr.length + 1);

        newArr[newArr.length-1] = elementToAdd;

        return newArr;
    }

// this method finds first elements INT index
    public static int indexOf (int [] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

// this method finds first elements STRING index
    public static int indexOf (String [] array, String word) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

// this method accept array and sums all numbers
    public static int sum (int [] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;

        }
        return sum;
    }
}

