package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 != 0;

        System.out.println(number + " Number is even: " + isEven);
        System.out.println(number + " Number is odd: " + isOdd);
    }
}
