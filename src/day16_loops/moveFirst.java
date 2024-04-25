package day16_loops;

import java.util.Scanner;

public class moveFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas, enter a sentence");
        String sentence = input.nextLine().trim();

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String restOfSens = sentence.substring(sentence.indexOf(" ") + 1);

        System.out.println(restOfSens + " " + firstWord);

    }
}
