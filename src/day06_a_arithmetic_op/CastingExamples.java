package day06_a_arithmetic_op;

public class CastingExamples {
    public static void main(String[] args) {
        int num1 = 40;
        float num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        float num3 = 10.5f;
        short num4 = (short)num3;
        System.out.println(num3);
        System.out.println(num4);
    }
}
