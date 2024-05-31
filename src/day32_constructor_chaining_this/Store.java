package day32_constructor_chaining_this;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        System.out.println(food1);

        System.out.println();
        Food food2 = new Food("Chips", 2 );
        System.out.println(food2);
        food2.price = 1.99;
        food2.calculatePrice();

        System.out.println(food2);

        System.out.println();
        Food food3 = new Food("Beer", 5, 5.05);
        System.out.println(food3);

        System.out.println();
        food1.quantity = 10;
        food1.price = 2.99;
        food1.calculatePrice();
        System.out.println(food1);

        System.out.println("-------------------------------");
        String str1 = new String("one");
        String str2 = new String("two");
        String str3 = new String("three");
        String [] arr = {"one", "two", "three"};
        String [] arr2 = {str1, str2, str3};

        Food [] allFood = {food1, food2, food3, null};
        System.out.println(allFood[2]);
        System.out.println(allFood[3]);
        allFood[3] = new Food("Fish", 4, 3.50);
        System.out.println(allFood[3]);
        System.out.println("-------------------------------");

        System.out.println("I have total " + allFood.length + " food");


        System.out.println("==================================");
         for (Food each : allFood) {
            System.out.println(each);

            }

        double totalPriceForAll = 0;
        for (Food each : allFood) {
            totalPriceForAll += each.totalprice;

        }
        System.out.println(totalPriceForAll);

        System.out.println("==================================");


        System.out.println("++++++++++++++++++++++++++++++++++++");

        ArrayList <Food> foodList = new ArrayList<>(Arrays.asList(allFood));
        System.out.println(foodList);
        System.out.println(foodList.get(0));

        foodList.add(new Food("Vodka", 2, 3));
        System.out.println(foodList);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // find the food which price > 10$
        for (Food each : allFood) {
            if (each.totalprice > 10) {
                System.out.println(each.name);

        }

    }
    }
}

