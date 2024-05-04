package day18_loops3;
/*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40

 */
public class Multiplication {
    public static void main(String[] args) {
        int num = 4;

        for (int i = 1; i < 10; i ++) {
            System.out.println(num + " x " + "1" + " = " + num * i);
        }
    }
}
