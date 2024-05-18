package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ClassRoom {
    public static void main(String[] args) {
        ArrayList <String> groupTwo = new ArrayList<>();
        groupTwo.add("Laura");
        groupTwo.add("Jeyhun");
        groupTwo.add("Andrew");
        groupTwo.add("Alex");
        groupTwo.add("Alex");
        System.out.println(groupTwo);

        ArrayList <String> groupThree = new ArrayList<>();
        groupThree.add("Kanan");
        groupThree.add("Gedi");
        groupThree.add("Anna");
        groupThree.add("Sammy");
        groupThree.add("Ludmila");
        System.out.println(groupThree);

        System.out.println("Firs student - " + groupTwo.get(0));
        System.out.println("Firs student - " + groupThree.get(0));

        System.out.println("Last student - " + groupTwo.get(groupTwo.size()-1));
        System.out.println("Last student - " + groupThree.get(groupTwo.size()-1));

        for (int i = 0; i < groupTwo.size(); i++) {
            System.out.println(groupTwo.get(i));
        }
        for (String each : groupThree) {
            System.out.println(each);
        }

    }





}
