package day28_arrayList_continue;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);

        nums.set(0, -100);
        System.out.println(nums);

        nums.set(3, 10000);
        System.out.println(nums);

        nums.set(nums.size() - 1, 50000);
        System.out.println(nums);

        System.out.println("---------------------------");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("java");
        list2.add("python");
        list2.add("c##");
        list2.add("javascript");
        System.out.println(list2);
        list2.set(2, "node.js");
        System.out.println(list2);

    }
}
