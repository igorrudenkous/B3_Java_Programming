package day26_methods;

import my_utilitis.ArrayUtil;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};

        int [] b = ArrayUtil.addElementInArray(a, 5);
        System.out.println(Arrays.toString(b));

    }

//    public static int [] addElementInArray (int [] origArr, int elementToAdd) {
//
//        int [] newArr = Arrays.copyOf(origArr, origArr.length + 1);
//
//        newArr[newArr.length-1] = elementToAdd;
//
//        return newArr;
//    }
}
