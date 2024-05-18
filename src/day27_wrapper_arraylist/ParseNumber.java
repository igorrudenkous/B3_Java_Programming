package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2024";


        // normal concatination
        System.out.println("Curent year " + year);
        System.out.println("Next year will be " + year + 1);

        int yearNum = Integer.parseInt(year);

        System.out.println(yearNum + 1);


        System.out.println("--------------------------");
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your message in this format: I am $x ears old: ");
        String str = key.nextLine(); //  I am $x years old

        // In 5 years, I will de 35 years old
        String age = str.split(" ")[2];
        int ageInt = Integer.parseInt(age);


        System.out.println("In 5 years, I will de " + (ageInt + 5) +  " years old");

    }
}
