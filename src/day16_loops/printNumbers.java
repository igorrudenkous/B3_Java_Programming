package day16_loops;

public class printNumbers {
    public static void main(String[] args) {
        int num = 2;

        while (num <= 100) {
            System.out.println(num);
            num += 2;
        }

        System.out.println("----------------------");

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i ++;
        }
    }
}
