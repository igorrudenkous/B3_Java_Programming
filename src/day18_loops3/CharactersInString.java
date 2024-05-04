package day18_loops3;

public class CharactersInString {
    public static void main(String[] args) {
        String str = "java";

        for (int i = 0; i < str.length(); i ++) {

            if (str.charAt(i) == '-') {
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
