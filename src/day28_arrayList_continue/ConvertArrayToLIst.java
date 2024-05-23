package day28_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToLIst {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3};

//        Arrays.asList(arr);

        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(l1);

        ArrayList <Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1423, 112, 2));
        System.out.println(l2);



    }

    public static Integer [] convertInttoInteger (int [] arr) {

        Integer [] objArr = new Integer[arr.length];

        for (int i = 0;  i < arr.length; i++) {
            objArr [i] = arr[i];
        }
        return objArr;
    }

}
