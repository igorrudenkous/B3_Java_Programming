package day31_constructor;

import java.util.Scanner;

public class UseCarpet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carpet carpet1 = new Carpet(input.nextDouble(), input.nextDouble(), true, 100.5);

        System.out.println(carpet1);

        carpet1.lenght = 14;
        // We had to call teh .calculatePrice() method again because that method was called in constructor. Since, we have updated the length, I am calling .calculateMethod() to get updated totalPrice.
        carpet1.calculatePrice();

        System.out.println();
        System.out.println(carpet1);
    }
}
