package day24_custom_methods;

public class NumberWords {
    public static void main(String[] args) {
    numberAsWord(800);
    }

    public static String numberAsWord(int num) {
        String result = "";
        if (num ==1) {
            result = "One";
        } else {
            result = "Two";
        }
        return result;
    }



}
