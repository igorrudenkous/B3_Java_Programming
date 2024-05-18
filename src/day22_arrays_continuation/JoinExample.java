package day22_arrays_continuation;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        System.out.println(String.join(", ", words));
        System.out.println(String.join("------", words));
        System.out.println(String.join("", words));


        System.out.println(String.join("\"", words));
    }
}
