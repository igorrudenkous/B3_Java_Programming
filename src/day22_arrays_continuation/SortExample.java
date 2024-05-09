package day22_arrays_continuation;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int [] nums = {2, 23, 56, 2, 43, -2, 555};
        int [] notSorted = nums;
        System.out.println(Arrays.toString(nums));


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------");

        System.out.println(Arrays.toString(notSorted));


        // min and max

        System.out.println("Min: " + nums[0]);
        System.out.println("Maх: " + nums[nums.length - 1]);
    }

}
