package day12_switch_statmens;

import java.util.Scanner;
import java.util.stream.Stream;

public class Shedule {
    public static void main(String[] args) {
        System.out.println("What day do you want to know about?");
        Scanner input = new Scanner(System.in);
        String day = input.next();
        String information = "";

        switch (day) {
            case "Monday":
                information = "We have mentor session.";
                break;
            case "Tuesday":
            case "Frieday":
                information = "We dont have mentor session.";
                break;
            case "Wednesday":
            case "Thursday":
                information = "We have Java class session.";
                break;
            case "Saturday":
                information = "We have Java class session.";
                break;
            case "Sunday":
                information = "We have Soft skill class session.";
                break;
            default:
                information = "Not correct day";
        }
        System.out.println(information);
    }

}
