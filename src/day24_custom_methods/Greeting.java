package day24_custom_methods;

import java.util.Scanner;

public class Greeting {

   public static void hello (String name) {
       System.out.println("Hello, " + name);

   }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = key.nextLine();

        hello(name);

        hello("Jace");
        hello("Tom");
        hello(name);
        hello(name);
    }
}
