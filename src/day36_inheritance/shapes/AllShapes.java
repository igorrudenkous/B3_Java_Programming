package day36_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {
        Circle obj1 = new Circle(4.5);
        System.out.println(obj1.area());
        System.out.println(obj1);

        Square obj2 = new Square(5);
        System.out.println(obj2.area(2));
        System.out.println(obj2);
    }

}
