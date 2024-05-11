package day24_custom_methods;

import java.util.Scanner;

public class Age {

    public static void getAge (int bithYear) {
        System.out.println("Age: " + (2024 - bithYear));

    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Your year born: ");
        int year2 = key.nextInt();

        getAge(year2);


    }
}
