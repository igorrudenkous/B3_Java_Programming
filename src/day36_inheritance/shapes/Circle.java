package day36_inheritance.shapes;

public class Circle extends Shape{
    double radius;

    public Circle (double radius) {
        super("Circle");
        this.radius = radius;
    }
@Override
    public double area () {
        return radius* radius * Math.PI;
    }
@Override
    public double perietr () {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Info about name " + name + ": \n Area: " + area() + "\n Perimetr: " + perietr();
    }
}


