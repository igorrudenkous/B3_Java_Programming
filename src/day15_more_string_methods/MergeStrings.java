package day15_more_string_methods;

public class MergeStrings {
    public static void main(String[] args) {
        String str = "abcvsfsdfsdf";
        String str2 = "xyz";

        String merger = "";

        merger += "" + str.charAt(0) + str2.charAt(0);

        System.out.println(str.indexOf("f" , 2 ));

        System.out.println(merger);
    }
}
