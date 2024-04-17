package day09_a_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your salary? : ");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work in a week? : ");
        int hoursInWeek = input.nextInt();

        double salarlyRate = salary / (hoursInWeek * 52);

        System.out.println("With the annual salary of " + salary + "and working for " + hoursInWeek + " hjurs in a wek, you hourly rate is $" + salarlyRate);
    }
}
