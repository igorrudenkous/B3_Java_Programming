package day30_b_custom_clasess;

import java.util.ArrayList;
import java.util.Scanner;

public class All_people {
    public static void main(String[] args) {
// Sample object
        Scanner input = new Scanner(System.in);
        String str = new String("hello");
        ArrayList <String> list = new ArrayList<>();

// Object Reference = actual Object
        Person person1 = new Person();
        Person person2 = new Person();

        // To access the INSTANCE variables, I need to create an object and use the object reference
        System.out.println("Person 1 info: ");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println("-------------------");
        System.out.println("Person 2 info: ");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

        // Now lets have /assign some values for Person
        System.out.println("-------------------");
        person1.name = "Tom";
        person1.age = 40;
        person1.height = 5.7;
        person1.isMarried = true;

        person2.name = "John";
        person2.age = 28;
        person2.height = 3.7;
        person2.isMarried = true;

        System.out.println("Person 1 info: ");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);
        System.out.println("-------------------");
        System.out.println("Person 2 info: ");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.height);
        System.out.println(person2.isMarried);

    }
}
