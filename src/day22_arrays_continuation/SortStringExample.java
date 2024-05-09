package day22_arrays_continuation;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] arr = {" java", "Hello", "$Dollar", "Zell", "4four", "6six", "Hi", "SIX"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
