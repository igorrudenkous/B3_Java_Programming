package day24_custom_methods;

public class MyFirsMethod {
    public static void main(String[] args) {

        System.out.println("Hello World! - 1");

        helloWorld();
        helloWorld10();

        System.out.println("Wello World! - 3");
    }

    public static void helloWorld () {
        System.out.println("Hello World! - 2");
    }

    public static void helloWorld10 () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World10");

        }
    }
}



