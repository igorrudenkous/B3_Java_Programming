package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {
        //Create a function that can verify if a number contains duplicate digits
        // ---> 182231 - true
        // ---> 123456 - false


        Predicate <Integer> verifyDublicates = (number) -> {
            String numInString = number + "";
            String uniques = "";
            for (int i = 0; i < numInString.length(); i++) {
               if (!uniques.contains(numInString.charAt(i) + "")) {
                   uniques += numInString.charAt(i);
               } else  {
                   return true;
               }
            }
            return false;
        };



        // Another way to do it with Collections.frequency() method
        Predicate<Integer> verifyDuplicates2 = (number) -> { // 102341

            String numInString = number + ""; // "10213418"
            boolean result = false;
            for (int i = 0; i < numInString.length(); i++) {
                result = Collections.frequency(Arrays.asList((number+"").split("")) , numInString.charAt(i)+"" ) > 1 ? true : false;             // "1021341" -- > ["1", "0", "2", "3", "4", "1"]
                if(result) {
                    break;
                }
            }
            return result;
        };

        System.out.println(verifyDublicates.test(182234514));
        System.out.println(verifyDublicates.test(1234567));

        System.out.println(verifyDuplicates2.test(102341));
        System.out.println(verifyDuplicates2.test(123456));

    }
}
