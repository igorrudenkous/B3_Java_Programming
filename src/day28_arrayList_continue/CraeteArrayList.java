package day28_arrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class CraeteArrayList {
    public static void main(String[] args) {
        ArrayList <String> listone = new ArrayList<>();
        listone.add("Hello");
        listone.add("Bye");
        System.out.println(listone);

        ArrayList <String> listtwo = new ArrayList<>(listone);
        System.out.println(listtwo);
        listtwo.add("Hola");
        System.out.println("-------------------");
        System.out.println(listone);
        System.out.println(listtwo);

        System.out.println("-------------------");
        ArrayList <String> listthree = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(listthree);




    }
}
