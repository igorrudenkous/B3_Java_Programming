package day18_loops3;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String sentence = input.nextLine().trim();

        int counter = 0;

        for (int i = 0; i < sentence.length(); i ++){
            if (sentence.charAt(i) == ' ') {
                counter++;
            }
            }
        System.out.println("There are total " + (counter + 1) + " words");
    }
}
