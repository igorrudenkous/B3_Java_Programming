package day14_string;

public class recapMethods {
    public static void main(String[] args) {
        String s = "pen";
        String s2 = new String("pen");

        System.out.println("Compare with == : " + (s == s2));
        System.out.println("Compare with. equals(): " + s.equals(s2));

        System.out.println("Compare with .equals(): " + s.equals("Pen"));
    }
}
