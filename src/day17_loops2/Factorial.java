package day17_loops2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;

        while (n > 1) {
            result = result * n;
            n--;
        }
        System.out.println("Factorial: " + result);
    }
}
