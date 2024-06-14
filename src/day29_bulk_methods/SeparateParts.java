package day29_bulk_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABCD123%%567FAFA!";
        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        ArrayList <String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        System.out.println(numbers);

    }
}
