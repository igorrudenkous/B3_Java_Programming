package day10_and_11_if_else;

import java.util.Scanner;

/*

    declare and assign 3 int variables
    between the 3 numbers find the print the biggest one

 */
public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");

        System.out.print("\tNumber 1: ");
        int number1 = input.nextInt();

        System.out.print("\tNumber 2: ");
        int number2 = input.nextInt();

        System.out.print("\tNumber 3: ");
        int number3 = input.nextInt();

        System.out.println("The number you entered: " + number1 + ", " + number2 + ", " + number3);

        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " is the biggest!");

        } else if  (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " is the biggest!");

        } else if  (number3 >= number1 && number3 >= number2) {
            System.out.println(number3 + " is the biggest!");
        } else {
            System.out.println("All same");
        }

    }
}
