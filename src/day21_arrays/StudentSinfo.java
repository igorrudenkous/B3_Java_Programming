package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentSinfo {
    public static void main(String[] args) {
        String[] student1 = {"AB001", "Tom", "Jerry", "1212"};
        System.out.println(Arrays.toString(student1));

        String[] student2 = new String[4];
        student2[1] = "Winnee";
        student2[3] = "213sa";
        student2[0] = "AV044";
        System.out.println(Arrays.toString(student2));

//        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);
//        System.out.println("Enter ID: ");
//        student3[0] = key.next();
//        System.out.println("Enter Name: ");
//        student3[1] = key.next();
//        System.out.println("Enter Last Name: ");
//        student3[2] = key.next();
//        System.out.println("Enter Number: ");
//        student3[3] = key.next();
//
//        System.out.println(Arrays.toString(student3));


        System.out.println("_________________________");

        String [] questions = {"Enter your ID: ", "Enter NAME: ", "Enter LAST NAME: ", "Enter number: "};

        String [] student4 = new String[4];
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            student4[i] = key.next();

        }
        System.out.println(Arrays.toString(student4));
    }
}
