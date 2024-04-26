package day17_loops2;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int waletPin = 9812;
        int userInput;
        int attempt = 0;

        System.out.println("Welcome to ATM");

        do {
            System.out.println("Pleas enter your PIN: ");
            userInput = input.nextInt();
            attempt ++;
        } while (attempt < 3 && userInput != waletPin);

        if (userInput == waletPin) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Blocking");
        }
    }

}
