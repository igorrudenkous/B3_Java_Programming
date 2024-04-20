package day15_more_string_methods;

import java.util.Scanner;

public class firstAndClass {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = key.nextLine();


        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length() -1));


    }
}
