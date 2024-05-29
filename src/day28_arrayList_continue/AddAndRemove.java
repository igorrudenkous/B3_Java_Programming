package day28_arrayList_continue;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("keyboard");
        list.add("mouse");
        System.out.println(list);

        list.remove(0);
        String str = list.remove(0);

        System.out.println(list);

        list.remove("mouse");

        System.out.println(list);


        System.out.println(list);
    }
}
