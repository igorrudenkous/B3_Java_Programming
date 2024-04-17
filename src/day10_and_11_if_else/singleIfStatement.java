package day10_and_11_if_else;

public class singleIfStatement {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World");

        }
        System.out.println("Second print");

        if (true) {
            System.out.println("Third print");


        }
        int score = 60;
        if (score >= 75) {
            System.out.println("Passing ");
        }

        if (score < 75) {
            System.out.println("falling the exam");

        }

        int year = 2021;
        boolean isLocdoun = year == 2000 || year == 2021;

        if (isLocdoun) {
            System.out.println("Stay at home");
        }

    }
}