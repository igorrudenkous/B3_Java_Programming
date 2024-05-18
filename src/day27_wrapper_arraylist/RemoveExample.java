package day27_wrapper_arraylist;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println(list.size());

        System.out.println(list);

        list.add("water");
        list.add("bread");
        list.add("butter");
        list.add("juice");
        System.out.println(list);

        list.add(1, "rice");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(list.size()-1);
        System.out.println(list);

        list.remove("bread");
        System.out.println(list);

        list.add("banana");
        list.add("banana");
        System.out.println(list);
        list.remove("banana");
        System.out.println(list);








    }



}
