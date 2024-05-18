package day23_multidimantion_arrays;

import java.util.Arrays;

public class MultidimantionArrays {
    public static void main(String[] args) {

        int [] n = {1, 2, 3, 4};
        int [] k = {5, 6, 7, 8};

        int [] [] all = {n, k};

        System.out.println(Arrays.deepToString(all));

        System.out.println("------------------------------");

        int [] [] multi = {
                {90, 876, 21},
                {63, 73, 23, 123},
                {123, 123},
                {124}
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[1].length);
        System.out.println(multi[2].length);
        System.out.println(multi[3].length);

        System.out.println(multi[1][2]);
        System.out.println(multi[2][0]);

        System.out.println(Arrays.toString(multi[1]));

    }
}
