package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double priceItem = input.nextDouble();
        System.out.print("Enter quantity of the item: ");
        int quaItem = input.nextInt();

        double revenue = priceItem * quaItem;
        System.out.println("The revenue of the item is: " + revenue);
    }
}
