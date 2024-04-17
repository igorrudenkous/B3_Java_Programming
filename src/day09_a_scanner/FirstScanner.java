package day09_a_scanner;
import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int userNumber = input.nextInt();
        System.out.println("Your input is: " + userNumber);

    }

}
