package day36_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class loop {
    public static void main(String[] args) {
        // we declare new Array List and asign value in this list
        ArrayList <String> newList = new ArrayList<>(Arrays.asList("java", "python", "c++", "node.js"));
        // we creat for each loop
        for (String each : newList) {
            //and print each element (object) in this array list
            System.out.println(each);
        }

        String name = "Hello World";
        for (String each : name.split("")) {
            System.out.println(each);
        }
    }


}
