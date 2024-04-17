package day10_and_11_if_else;

public class ternaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        if (a % 2 == 0) {
            evenOrOdd = "Even";
        }else  {
            evenOrOdd = "Odd";
        }
        System.out.println("The number is " + evenOrOdd);

        System.out.println("--------------------------------");
        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        System.out.println("--------------------------------");

        int num = -4;
        String posOrNeg;
        if (num < 0) {
            posOrNeg = "Negative";
        } else {
            posOrNeg = "Positive";
        }
        System.out.println(posOrNeg);

        posOrNeg = (num >= 0) ?  "Positive" : "Negative" ;
        System.out.println(posOrNeg);


    }
}
