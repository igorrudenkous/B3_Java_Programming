package day17_loops2;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print number of cicle: ");
        int numCicle = input.nextInt();
        int n = 1;

        int max = -2_147_483_647;
        int min = 2_147_483_647;

        while (n <= numCicle) {
            System.out.println("Pleas enter the number:");
            int userNum = input.nextInt();

            if (userNum > max) {
                max = userNum;
            }
            if (userNum < min) {
                min = userNum;
            }
            n ++;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
