package day23_multidimantion_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] nums = {4, 10, 30, 100, 50};

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 50));
    }
}
