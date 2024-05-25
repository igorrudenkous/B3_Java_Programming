package day29_bulk_methods;


import java.util.ArrayList;
import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();

        System.out.println(statusofShoppingList(shoppingList));
        String userAnswer = "";

        do {
        System.out.println("Pleas enter string: ");
        shoppingList.add(input.nextLine());

        System.out.println("Do you want to continue? ");
        userAnswer = input.nextLine();
      } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));

        System.out.println("Shopping List has " + shoppingList.size() + " item:");
       for (String eachItem : shoppingList ){
           System.out.println("\t" + eachItem);
        }

        System.out.println("-----------------");

        System.out.println("What item you want to chek in the list?: ");

       itemAvailability(shoppingList, input.nextLine());

        System.out.println("-----------------");
        System.out.println("Do you want to remove any item? ");

        if (input.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("What item do you want to remove?");
            String itemRemove = input.nextLine();
            if (Character.isDigit(itemRemove.charAt(0))) {
                int num = Integer.parseInt(itemRemove);
                shoppingList.remove(num - 1);
            } else {
                shoppingList.remove(itemRemove);
            };
        }
        System.out.println("Final list is: " + shoppingList );
    }

    public static String statusofShoppingList (ArrayList <String> sL) {
        return sL.isEmpty() ? "List is empty!" : "You have same items!";
    }

    public static void itemAvailability (ArrayList <String> sL, String itemtoCheck) {
        System.out.println(sL.contains(itemtoCheck) ? "is on list" : "is not on list");
    }


}
