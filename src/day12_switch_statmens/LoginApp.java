package day12_switch_statmens;

import java.util.Scanner;

/*
    inputs:
        declare and assign a 4 digit pin code
        declare and assign the last 4 digits of ssn: 1234

        declare and assign expected values for both
            example expected:
                pin: 1552
                ssn: 1234

    outputs:

            when the pincode and ssn match the expected print:
                Authentication successful

            when the pincode or ssn are not correct print:
                Authentication failed

            when the pincode was not correct print:
                incorrect pin code

            when the ssn is not correct print:
                invalid ssn
     */
public class LoginApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int actualpin = 4444, actuallastDSSN = 1111;

        System.out.print("Enter 4 digit of your pin code: ");
        int pinCode = input.nextInt();
        System.out.print("Enter last 4 digit of your SSN: ");
        int ssnDigit4 = input.nextInt();

        if (pinCode == actualpin && actuallastDSSN == ssnDigit4) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
            if (pinCode != actualpin) {
                System.out.println("incorrect pin code");

            } else if (ssnDigit4 != actuallastDSSN) {
                System.out.println("invalid ssn");
            }
        }
    }
}
