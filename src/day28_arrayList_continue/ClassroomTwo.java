package day28_arrayList_continue;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        System.out.println(group.size());
        System.out.println(group.isEmpty());
        System.out.println(group.contains("Hello"));
        System.out.println(group);

        group.add("Tom");
        group.add("Micky");
        System.out.println(group);
        System.out.println(group.get(0));
        System.out.println(group.get(1));
//        System.out.println(group.get(2));

        group.add(0, "Winnie");
        System.out.println(group);
        System.out.println(group.get(group.size() - 1));

    }
}
