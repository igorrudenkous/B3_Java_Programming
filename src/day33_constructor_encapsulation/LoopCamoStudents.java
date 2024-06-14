package day33_constructor_encapsulation;

import java.util.Arrays;

public class LoopCamoStudents {
    String name;
    int groopnumber;

    static int batchnumber;
    static String [] teachers;
    static String schoolNmae;


    static {
        batchnumber = 3;
        teachers = new String[] {"Nadir", "Feyruz", "James", "Diana"};
        schoolNmae = "LoopCamp";
        printInfo();
    }
    public static void printInfo () {
        System.out.println("School Name: " + schoolNmae);
        System.out.println("Batch number: " + batchnumber);
        System.out.println("Teachers: " + Arrays.toString(teachers));
    }

    public LoopCamoStudents (String name, int groopnumber) {
        this.name = name;
        this.groopnumber = groopnumber;
    }

    @Override
    public String toString() {
        return "LoopCam Students Info: " +
                "\nname - " + name +
                "\ngroopnumber - " + groopnumber;
    }
}
