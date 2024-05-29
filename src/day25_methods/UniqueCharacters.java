package day25_methods;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("HellllooocqHs"));
    }

    public static String uniqueCharacters (String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char eachletter = str.charAt(i);
            if (!unique.contains("" + eachletter)) {
                unique += eachletter;
            }
        }
        return unique;
    }
}
