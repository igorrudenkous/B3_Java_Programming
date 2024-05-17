package day26_methods;

public class Picture {

    public static void draw() {
        System.out.println("Trying to draw");
    }

    public static void draw(String color) {
        System.out.println("Trying to draw " + color);
    }

    public static void draw(String color, String color2) {
        System.out.println("Trying to draw " + color + " color and " + color2 + " color");
    }

}
