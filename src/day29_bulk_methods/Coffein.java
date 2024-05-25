package day29_bulk_methods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Coffein {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("Cofee");
        drinks.add("Tea");
        drinks.add("energy drinks");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList <String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        String [] allDrinks = {"Cofee", "Tea", "energy drinks", "soda"};
        ArrayList <String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        ArrayList <String> drinks4 = new ArrayList<>(Arrays.asList("Cofee", "Tea", "energy drinks", "soda"));
        System.out.println(drinks4);

//TODO BULK OPERATIONS

        ArrayList <String> drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList(allDrinks));
        System.out.println(drinks5);

        ArrayList <String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList("Cofee", "Tea", "energy drinks", "soda"));
        System.out.println(drinks6);

        drinks6.addAll(0, Arrays.asList("chek1", "chek2"));
        System.out.println(drinks6);
    }
}
