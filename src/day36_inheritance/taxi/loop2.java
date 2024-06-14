package day36_inheritance.taxi;
import java.util.ArrayList;
import java.util.Arrays;

public class loop2 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"This Is A Test", "Another Example Sentence", "this One Has An Issue", "Correct Again"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String each : arrayList) {
            for (int i = 0; i < each.length(); i++) {
                if (Character.isUpperCase(each.charAt(0))) {
                    System.out.println(each);
                }
            }

        }
    }
}