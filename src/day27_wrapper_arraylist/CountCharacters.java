package day27_wrapper_arraylist;
/*
/*
    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU
 */

public class CountCharacters {
    public static void main(String[] args) {
        String str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            } else if (Character.isDigit(each)) {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Digit: " + digit);
        System.out.println("Other: " + other);
    }
}
