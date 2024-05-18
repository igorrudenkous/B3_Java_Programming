package day25_methods;

import my_utilitis.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int [] arr = {12, 43, 24, 123, 12, 2, 1124};
        System.out.println(ArrayUtil.minNumInSortArray(arr));
        System.out.println(ArrayUtil.maxNumInSortArray(arr));

    }

//    public static int minNumInSortArray (int [] arr) {
//        Arrays.sort(arr);
//
//       return arr[0];
//    }

//    public static int minNumInArray (int [] arr) {
//
//        int min = arr[0];
//        for (int eachNum : arr) {
//            if (eachNum < min) {
//                min = eachNum;
//            }
//        }
//        return min;
//    }
}
