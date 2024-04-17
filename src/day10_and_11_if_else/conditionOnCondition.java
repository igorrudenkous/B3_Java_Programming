package day10_and_11_if_else;

public class conditionOnCondition {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean c = true;

        if (a) {
            System.out.println(1);
            if (b) {
                System.out.println(3);
            }
        }else {
            System.out.println(2);
            if (c) {
                System.out.println(3);
            }

        }
    }
}
