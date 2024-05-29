package day30_a_arraylist;

import my_utilitis.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

/*
        Reverse All

        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        @param words - Given ArrayList of Strings @return - ArrayList of Strings

        Ex:
            Input: {"ted", "talk", "learn"}
            Output: {"det", "klat", "nrael"}
 */
public class ReverseAll {



    public static ArrayList<String> reverseAll (ArrayList<String> listtorevers ) {

        ArrayList <String> reverse = new ArrayList<>();
        for (String each : listtorevers) {
            reverse.add(StringUtil.reversWord(each));
        }
        return reverse;

//        for (String each : listtorevers) {
//            String str = "";
//
//            for (int i = each.length()-1; i >= 0; i--) {
//                str += each.charAt(i)
        }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "leara"));

        System.out.println(list);
        System.out.println(reverseAll(list));
    }

    }

