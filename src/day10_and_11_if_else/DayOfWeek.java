package day10_and_11_if_else;

import java.util.Scanner;
/*

     Declare and assign a number (day)

         1 - Monday
         2 - Tuesday
         ..
         6 - Saturday
         7 - Sunday

         Ex: 2
             Tuesday

             // website: ww.google.com

  */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-7 each representing a day of week: ");
        int numOfWeek = input.nextInt();

        if (numOfWeek == 1) {
            System.out.println("Monday");
        } else if (numOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (numOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (numOfWeek == 4) {
            System.out.println("Thursday");
        } else if (numOfWeek == 5) {
            System.out.println("Friday");
        } else if (numOfWeek == 6) {
            System.out.println("Saturday");
        } else if (numOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("There is no such day");
        }
    }
}
