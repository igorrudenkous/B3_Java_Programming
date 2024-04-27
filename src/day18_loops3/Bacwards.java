package day18_loops3;

public class Bacwards {
    public static void main(String[] args) {
        String str = "loopacademy";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
