package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBody {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isDivisible2 = number % 2 == 0;
        boolean isDivisible3 = number % 3 == 0;;
        boolean isDivisible5 = number % 5 == 0;;

        System.out.println(number + " is divisible by 2:" + isDivisible2);
        System.out.println(number + " is divisible by 3:" + isDivisible3);
        System.out.println(number + " is divisible by 5:" + isDivisible5);
    }
}
