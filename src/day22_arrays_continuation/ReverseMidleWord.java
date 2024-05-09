package day22_arrays_continuation;

public class ReverseMidleWord {
    public static void main(String[] args) {
        String str = "java always fun";

        String [] words = str.split(" ");

        char [] letters = words[1].toCharArray();

        String reverse = "";

        for (int i = letters.length-1; i >= 0 ; i--) {

            reverse += letters[i];

        }
        System.out.println(reverse);
        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }
}
