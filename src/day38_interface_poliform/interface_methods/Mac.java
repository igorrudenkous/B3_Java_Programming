package day38_interface_poliform.interface_methods;

public interface Mac {
    // We can have 4 things in Interface
    // Everything in interface has "public" access modifiers

    //#1 - public static final variables - CONSTANTS
    String NAME = "MAC";
    String OS = "iOS";

    //#2 Abstract method
    void turnOn ();


    // Q: How do I have a method in interface with BODY / CODE BLOCK
    // A: 2 options - 1) static method, 2) default method
    //#3 - 1) - static method
    public static void company() {
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New release normaly is in Now");
    }


    default void faceTime () {
        System.out.println("opening Facetime");
        System.out.println("Calling someone");
    }
}
