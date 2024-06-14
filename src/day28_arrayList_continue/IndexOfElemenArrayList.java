package day28_arrayList_continue;

import java.util.ArrayList;

public class IndexOfElemenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(400);
        nums.add(500);
        nums.add(100);
        nums.add(700);
        System.out.println(nums);
// it is find the index of the firs match
        System.out.println(nums.indexOf(100));

        System.out.println(nums.indexOf(700));

        int index = nums.indexOf(500);
        System.out.println(index);

        System.out.println(nums.lastIndexOf(100));

        nums.remove(nums.lastIndexOf(100));
        System.out.println(nums);

        nums.set(nums.lastIndexOf(100), -100);
        System.out.println(nums);
    }
}
