package day09_a_scanner;

import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Pleas, enter 3 numbers and hit enter after each");
        int numberOne = key.nextByte();
        int numberTwo = key.nextByte();
        int numberTree = key.nextByte();

        System.out.println("--------------------");


        System.out.println("summ las 3 = " + (key.nextInt() + key.nextInt() + key.nextInt()));
        System.out.println("summ first 3 = " + (numberOne + numberTwo + numberTree));
    }
}

