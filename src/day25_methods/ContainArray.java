package day25_methods;

import my_utilitis.ArrayUtil;

public class ContainArray {
    public static void main(String[] args) {

     int [] array = {123, 12, 21, 12, 36, 5};
     int num = 36;

        System.out.println(ArrayUtil.containsNumInArray(array, num));

    }
//    public static boolean containsNumInArray (int [] arr, int num) {
////        boolean result = false;
//        for (int eachNum : arr) {
//            if (eachNum == num) {
//                return true;
//            }
//        }
//    return false;
//    }
}
