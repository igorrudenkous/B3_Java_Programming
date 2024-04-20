package day15_more_string_methods;

public class IndexofMethod2 {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println("_____________");

        String s3 = "abababababa";
        System.out.println(s3.indexOf("b", 4));
        System.out.println(s3.lastIndexOf("b", 4));
    }
}
