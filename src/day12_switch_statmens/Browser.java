package day12_switch_statmens;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Browser: ");
        String browser = input.next();

        switch (browser) {
            case "chrome":
                System.out.println("good - opening google in " + browser);
                break;
            case "firefox":
                System.out.println("good - opening google in " + browser);
                break;
            case "opera":
                System.out.println("good - opening google in " + browser);
                break;
            case "safari":
                System.out.println("good - opening google in " + browser);
                break;
            default:
                System.out.println("We dont now this browser");

        }
    }
}