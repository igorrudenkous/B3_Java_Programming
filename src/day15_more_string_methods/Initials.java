package day15_more_string_methods;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Pleas enter your first name: ");
        String firstName = key.next().toUpperCase().trim();
        System.out.println("Pleas enter your last name: " );
        String lastName = key.next().toUpperCase().trim();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        System.out.println("" + first + last);
    }
}
