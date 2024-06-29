package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        Function <int [], List <Integer>> converArrIntoList = arr -> {
        List <Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
        };


        int [] a = {34, 23, 62, 123, 64, 2};
        System.out.println(converArrIntoList.apply(a));

        System.out.println(new HashSet<>(converArrIntoList.apply(a)));

        // also sort
        System.out.println( new TreeSet<>(converArrIntoList.apply(a)));

    }
}
