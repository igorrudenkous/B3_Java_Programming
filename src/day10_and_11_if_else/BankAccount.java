package day10_and_11_if_else;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Whats your balance: $");
        double balance = input.nextDouble();

        System.out.print("How much you want to withdraw?: $");
        double withdraw = input.nextDouble();

        balance -= withdraw;
        if (balance < 0) {
            System.out.println("You took too much. 100 overdraft : fee will be");
            balance -= 100;
            System.out.println("You balance after fees: " + balance);
        }else {
            System.out.println("Your balans after withdraw are: " + balance);
        }

    }
}
