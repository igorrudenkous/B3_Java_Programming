package day09_a_scanner;

import java.util.Scanner;

public class nameUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Are you employeed? : true/false ");
        boolean isEmployeed = input.nextBoolean();

        System.out.print("Are you student? : true/false ");
        boolean isStudent = input.nextBoolean();

        System.out.println("Your all info : " + firstName + lastName + isEmployeed + isStudent);
    }
}
