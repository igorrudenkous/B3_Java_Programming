package day12_switch_statmens;
/*
   create a class Diver

   You are diving in the ocean. Your oxygen tank has a certain level (number)

   declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

       Above 90 - Your tank is full
       Above 80 - Still okay
       Above 70 - Don't go too far
       Above 60 - Start to head back
       Above 50 - Be careful now you at at 50%
    */
public class oxygen {
    public static void main(String[] args) {

        int oxygenLevel = 80;

//        if (oxygenLevel > 50 && oxygenLevel <= 60) {
//            System.out.println("Be carfully");
//        } else if (oxygenLevel > 60 && oxygenLevel <= 70) {
//            System.out.println("Start to head back");
//        }
//
        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still ok");
        } else if (oxygenLevel > 70) {
            System.out.println("Dont go to far");
        } else if (oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be carfully");
        } else {
            System.out.println("See you in heaven!");
        }

    }
}
