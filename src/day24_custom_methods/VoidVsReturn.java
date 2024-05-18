package day24_custom_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

        sauHello();
        System.out.println(sayHello2());

    }

    public static void sauHello () {
        System.out.println("hello");
    }

    public static String sayHello2 () {
        return "hello";
    }
}
