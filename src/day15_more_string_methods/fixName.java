package day15_more_string_methods;

import java.util.Scanner;

public class fixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = key.next().trim();
        System.out.println("Enter your last name: ");
        String lastName = key.next().trim();

        String fixedFirstName = ("" + name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        String fixedLastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(fixedFirstName);
        System.out.println(fixedLastName);
    }
}
