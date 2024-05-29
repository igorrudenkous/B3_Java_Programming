package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {

    public static ArrayList <Integer> sumFromString (ArrayList <String> numsToSum) {
        ArrayList <Integer> sums = new ArrayList<>(); //"123', "34", "313"

        for (String each : numsToSum) {
            int sumOfeach = 0;
            for (String eachLetter : each.split("")) {
                sumOfeach += Integer.parseInt(eachLetter); // "1" ----- > 1
            }
            sums.add(sumOfeach);//["1", "2", "3" ]
        }
        return sums;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList <Integer> sumedVersion = sumFromString(list);
        System.out.println(sumedVersion);
        System.out.println(sumFromString(list));
    }
}
