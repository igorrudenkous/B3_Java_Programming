package day15_more_string_methods;

import java.util.Scanner;

public class title {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Pleas enter your name with titles");
    String name = input.nextLine().toLowerCase();

    if (name.startsWith("mr.") || name.startsWith("mister.")) {
        System.out.println("Hello Sir.");
    } else if (name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("madam.")) {
        System.out.println("Hello Madam.");
    } else if (name.startsWith("dr.")) {
        System.out.println("Hello Doctor.");
    }

    if (name.endsWith("sr.")) {
        System.out.println("Nice to meet you Senior");
    } else if (name.endsWith("dr.")) {
        System.out.println("Hello Doctor.");
    }
}

}

