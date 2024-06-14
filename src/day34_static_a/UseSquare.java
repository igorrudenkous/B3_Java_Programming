package day34_static_a;

public class UseSquare {
    public static void main(String[] args) {
        Square obj = new Square(-5);
        System.out.println(obj.getSide());

        obj.setSite(11);
        System.out.println(obj.getSide());

        System.out.println(obj);
    }
}
