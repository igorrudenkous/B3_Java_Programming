package day21_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AttayIntro {
    public static void main(String[] args) {
        String str = "Chicago, NeyYork, Houston, Denver, Pittsburgh";
//        String [] city = str.split(", ");
        String [] city = {"Chicago", "NeyYork", "Houston", "Denver", "Pittsburgh"};

        String city1 = city[0];
        String city2 = city[1];
        String city3 = city[2];
        String city4 = city[3];
        String city5 = city[4];

        System.out.println(city);
        System.out.println(Arrays.toString(city));

        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city3);
        System.out.println(city4);
        System.out.println(city5);

        String convertArr = Arrays.toString(city).replaceAll(",", "");
        System.out.println(convertArr);
        System.out.println(convertArr.substring(1, convertArr.length() -1));

        System.out.println(city.length);


    }
}
