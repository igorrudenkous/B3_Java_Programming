package day26_methods;

import my_utilitis.ArrayUtil;

public class UsungArrayUtil {
    public static void main(String[] args) {
    int [] a = {3, 1, 5, 7, 3, 23};

        System.out.println(ArrayUtil.minNumInSortArray(a));
        System.out.println(ArrayUtil.maxNumInSortArray(a));
        System.out.println(ArrayUtil.containsNumInArray(a, 5));

    }
}
