package day27_wrapper_arraylist;

import my_utilitis.ArrayUtil;

import java.util.Arrays;

public class UseAddElemMethod {
    public static void main(String[] args) {
        int [] a = {1, 3, 4, 7, 8};
        int [] b = {23, 345, 2, 8};

        int [] arr = ArrayUtil.eddCombineArray(a, b);

        System.out.println(Arrays.toString(ArrayUtil.eddCombineArray(a, b)));
        System.out.println(ArrayUtil.maxNumInSortArray(arr));

    }
}
