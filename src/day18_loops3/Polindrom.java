package day18_loops3;
import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

/*
      Palindrome: its the same reading from the beginning and end
      Ex:
          mom
          racecar
          anna
          madam
      Task: Check if a word is palindrome
      Flow:
          declare some initial String
          how to reverse a String
          check if the reverse version is the same as the original
   */
public class Polindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = input.next();
        String reserved = "";

        for (int i = str.length() - 1; i >= 0; i --) {
            reserved += str.charAt(i);
     }
        if (str.equals(reserved)) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NOT POLINDROM");
        }
    }
}
