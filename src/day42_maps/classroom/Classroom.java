package day42_maps.classroom;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 30, 10);

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, s1);
        System.out.println("-----------");
        map.put(2, new Student("Micky", 34, 122));
        map.put(3, new Student("Jack", 21, 12));
        map.put(4, new Student("Igor", 18, 35));
        System.out.println(map);

        System.out.println("-----------");
        //Q: get me the Student name which is assigned to the KEY 4
        System.out.println(map.get(3).name);

        System.out.println("-----------");
        //Q: How can I get all the KEYs only.
        // A: -keySet:
        System.out.println(map.keySet());

        System.out.println("-----------");
        //Q: How can I get all the VALUES only
        //A: values()
        System.out.println(map.values());

        //loop and get each
        System.out.println("-----------");
        for (Integer each : map.keySet()) {
            System.out.println("Row number " + each);
            System.out.println(map.get(each));
            System.out.println();
        }

        System.out.println("-----------");
        //another way to loop each  value only
        for (Student each : map.values()) {
            System.out.println(each);
            System.out.println();
        }

        System.out.println("-----------");
        //only age less 25
        for (Student each : map.values()) {
            if (each.age < 25) {
                System.out.println(each);
                System.out.println();
            }
        }

    }
}
