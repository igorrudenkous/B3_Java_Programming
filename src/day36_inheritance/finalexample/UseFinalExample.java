package day36_inheritance.finalexample;

public class UseFinalExample {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample(4);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(FinalExample.planet);
        obj.a = 99;
        System.out.println(obj.a);

        System.out.println();
        FinalExample obj2 = new FinalExample(6);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(FinalExample.planet);
        obj2.a = 88;
        System.out.println(obj2.a);

    }
}
