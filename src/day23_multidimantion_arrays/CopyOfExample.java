package day23_multidimantion_arrays;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 10;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int [] y = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(y));



        int [] k = Arrays.copyOf(a, a.length*2);
        System.out.println(Arrays.toString(k));


        int [] l = Arrays.copyOf(a, a.length-1);
        System.out.println(Arrays.toString(l));


    }

}
