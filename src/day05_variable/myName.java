package day05_variable;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class myName {
    public static void main(String[] args) {
        char first = 'I';
        char second = 'g';
        char third = 'o';
        char fourth = 'r';

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println();
        System.out.println(first);
        System.out.println(first + second + third + fourth);

        String name = "" + first + second + third + fourth;
        System.out.println(name);
    }
}
