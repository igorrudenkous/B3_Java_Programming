package day18_loops3;

import java.util.Scanner;
/*
    Given a String we want to count how many 'a' characters we have
    Challenge: adjust so that we can check for not only 'a' but any character
    Ex: aabbcaa
        4
 */
public class CountLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("Pleas enter the word: ");
        String word = input.next();

        System.out.println("Pleas enter character: ");
        String character = input.next();

        while (character.length() != 1) {
            System.out.println("It was not single character. Pleas enter again");
            character = input.next();
        }

        char letter = character.charAt(0);

        for (int i = 0; i < word.length(); i ++) {
            char eachCharOnEachCycle = word.charAt(i);
            if (eachCharOnEachCycle == letter) {
                counter ++;
            }
        }
        System.out.println("Amount of letters \"a\" is:  " + counter);
    }
}
