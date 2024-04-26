package day17_loops2;
/*
    repeated actions
        -ask the user to enter the item
        -add item to the shopping list
        -ask user if they want to add more items.

    At the end show the whole item list
 */
import java.util.Locale;
import java.util.Scanner;


public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String list = "Shopping List";
        String uSeranswer;

        do {
            System.out.println("Pleas enter the name of the item: ");
            String userItem = key.nextLine();
            list = list + "\n\t" + userItem;

            System.out.println("Do you want to add more item?");
            uSeranswer = key.nextLine().toLowerCase(Locale.ROOT);

        } while (uSeranswer.equalsIgnoreCase("yes") || uSeranswer.equalsIgnoreCase("y") || uSeranswer.equalsIgnoreCase("yes"));

        System.out.println(list);








    }
}
