package day19_nested_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print sentence: ");
        String line = input.nextLine();

        String [] newLine = line.split(" ");
        String word1 = newLine[0], word2 = newLine[1], word3 = newLine[2];
        String reversMiddle = "";

        for (int i = word2.length() - 1; i >= 0; i--) {
            reversMiddle += word2.charAt(i);
        }
        System.out.println(word1 + " " + reversMiddle + " " + word3);
    }
}
