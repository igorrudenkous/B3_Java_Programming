package day29_bulk_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 14, 124, 21, 1));

        //.sort()
        Collections.sort(list);
        System.out.println(list);
    }
}
