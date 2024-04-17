package day12_switch_statmens;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.print("***Hi! Welcome to ATM!***\nPlease enter your card \nand tupe your pincode: ");
        Scanner input = new Scanner(System.in);
        int userInputPin = input.nextInt();

        int expectedPin = 6789;
        double balanse = 1_000_000;

        if (userInputPin == expectedPin) {
            System.out.println("You are logged in");
            System.out.println("Select a number for  your need:");
            System.out.println("\t1 - Check balanse");
            System.out.println("\t2 - Withdrow");
            System.out.println("\t3 - Deposit");
            System.out.println("\nYour choice is - ");
            int option = input.nextInt();

            if (option == 1) {
                System.out.println("Your balance is $" + balanse);
            } else if (option == 2) {
                System.out.println("How much fo you want to withdrow? - ");
                double amountWithdrow = input.nextDouble();
                System.out.println("Stand by ..... withdrowing $ " + amountWithdrow);
                balanse -= amountWithdrow;
            } else if (option == 3) {
                System.out.println("Pleas insert the money!");
                double deposit = input.nextDouble();
                balanse += deposit;
                System.out.println("Your balanse is $" + balanse);
            } else {
                System.out.println("Invalid selection");
            }
        } else {
            System.out.println("Incorrect pin");
        }
    }
}


