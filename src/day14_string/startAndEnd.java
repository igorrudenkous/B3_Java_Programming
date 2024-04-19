package day14_string;

public class startAndEnd {
    public static void main(String[] args) {
        String str = "Loopcamp";
        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));

        String sentens = "today it was a Java day";
        System.out.println(sentens.startsWith("today it was"));
        System.out.println(sentens.endsWith("day"));
        System.out.println(sentens.endsWith("today it was a Java day"));
    }
}
