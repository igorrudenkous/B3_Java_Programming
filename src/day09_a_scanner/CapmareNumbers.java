package day09_a_scanner;
import java.util.Scanner;

public class CapmareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int numberOne = input.nextInt();
        System.out.print("Enter number 2: ");
        int numberTwo = input.nextInt();

        boolean areNumsEqual = numberOne == numberTwo;

        System.out.println("the numbers are equal: " + areNumsEqual);
        System.out.println("-------------------------------");
        System.out.println("Number 1 + 5 = " + (input.nextInt() + 5));

    }

}
