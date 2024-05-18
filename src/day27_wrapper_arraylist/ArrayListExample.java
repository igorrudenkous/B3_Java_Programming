package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {  // ArrayList does NOT work with PRIMITIVE DATA TYPE
        ArrayList <Integer> numbers = new ArrayList<>(); // At this line in my ArrayList there is no element
        System.out.println(numbers);

        // add/assign to ArrayList

        int [] num = {1, 3, 4, 5};
        int num2 = num[2];
        numbers.add(40);

        System.out.println(numbers);

        numbers.add(50);

        System.out.println(numbers);

        numbers.add(-60);
        numbers.add(70);
        numbers.add(10);
        numbers.add(num2);
        System.out.println(numbers);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));

        // How do we know the number of total elements in ArrayList
        System.out.println(numbers.size());
    }
}
