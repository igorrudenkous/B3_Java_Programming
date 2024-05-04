package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a number so, I can return you the Month name related to that number.");
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //System.out.println(months.length);
        //System.out.println(months[0]);
        //System.out.println(months[months.length-1]);
        int num;
        do {
            System.out.print("Enter: ");
            num = key.nextInt();

            if (num >= 1 && num <= 12) {
                System.out.println("The number you entered is: " + months[num-1]);
            } else {
                System.out.println("Wrong Input. There is no month for that number: " + num + " Try again!");
            }

        } while (num < 1 || num > 12);



    }
}