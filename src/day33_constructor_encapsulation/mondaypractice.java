package day33_constructor_encapsulation;

import java.util.Scanner;

public class mondaypractice {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String name = "";
//        while (name.isBlank()) {
//            System.out.println("Pleas enter name: ");
//            name = input.nextLine();
//            }
//        System.out.println(name);
//        }

//        Scanner input = new Scanner(System.in);
//        String name;
//        do {
//            System.out.println("Pleas enter name: ");
//            name = input.nextLine();
//        } while (name.isBlank());
//        System.out.println(name);


//        Scanner input = new Scanner(System.in);
//        String nameCorrect = "";
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            System.out.println("Pleas enter name: ");
//            String name = input.nextLine();
//            if (name.isBlank()) {
//                i ++;
//            } else {
//                nameCorrect = name;
//                break;
//            }
//        }
//        System.out.println(nameCorrect);

    Scanner input = new Scanner(System.in);
    System.out.println("Lets play in game. Give me a number and i try to guess him! ");
    int secretNumber = input.nextInt();
    int number2;
    do {
        System.out.println("Enter number: ");
        number2 = input.nextInt();
        if (secretNumber > number2) {
            System.out.println("The number's bigger, try again!");
        } else if (secretNumber < number2) {
            System.out.println("The number's smaller, try again!");
        }
    } while (secretNumber != number2);
        System.out.println("It's a victory ");
    }
}


