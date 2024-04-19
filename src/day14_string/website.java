package day14_string;

import java.util.Locale;
import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter website   : ");
        String url = input.next().toLowerCase();

        boolean isvalidStart = url.startsWith("www.");
        boolean isvalidEnd = url.endsWith(".com") || url.endsWith(".gov") || url.endsWith(".eu");

        if (isvalidStart && isvalidEnd) {
            System.out.println("It is valid website");
        } else {
            System.out.println("Not avalibe");
            if (!isvalidEnd){
                System.out.println("Is invalid end");
            }
            if (!isvalidStart) {
                System.out.println("Is invalid start");
            }
        }
    }
}
