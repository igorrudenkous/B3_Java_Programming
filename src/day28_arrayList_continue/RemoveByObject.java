package day28_arrayList_continue;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(700);
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);


        Integer elem = 1;
        nums.remove(elem);
        System.out.println(nums);

        nums.remove((Integer) 500);
        System.out.println(nums);
    }
}
