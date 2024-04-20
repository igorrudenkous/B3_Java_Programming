package day15_more_string_methods;

import java.util.Scanner;

/*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter tree words: ");
        String word1 = input.next().toLowerCase();
        String word2 = input.next().toLowerCase();
        String word3 = input.next().toLowerCase();

        int word1Lenght1 = word1.length();
        int word1Lenght2 = word2.length();
        int word1Lenght3 = word3.length();

        if (word1.contains("a") & word1Lenght1 > word1Lenght2 && word1Lenght1 > word1Lenght3) {
            System.out.println(word1 + " word 1 is bigger ");
        } else if (word2.contains("a") & word1Lenght2 > word1Lenght1 && word1Lenght2 > word1Lenght3) {
            System.out.println(word2 + " word 2 is bigger ");
        } else if (word3.contains("a") & word1Lenght3 > word1Lenght1 && word1Lenght3 > word1Lenght2) {
            System.out.println(word3 + " word 3 is bigger ");
        } else {
            System.out.println("There is no single or biggest word does not have \"a\" in it");
        }
    }
}
