package day12_switch_statmens;
/*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan

    based on the number they picked print a message:

        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
 */
import java.util.Scanner;

public class ChooseLang {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a language: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Ukrainia\n\t5 - French\n\t6 - Azerbaijan\n\n\tChoose option: ");
        int userOption = key.nextInt();
        System.out.print("You picked: " + userOption);

        if (userOption == 1) {
            System.out.println("hello, thanks for your call");
        } else if (userOption == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (userOption == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (userOption == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (userOption == 5) {
            System.out.println("Merci ,pour votre appel");
        } else if (userOption == 6){
            System.out.println("Salam, zeng ettiginiz ucun mennatdariq");
        }


    }
}
