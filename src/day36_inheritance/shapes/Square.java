package day36_inheritance.shapes;


public class Square extends Shape {
    double side;

    public Square (double side) {
        super("Square");
        this.side = side;
    }
    @Override
    public double area () {
        return side * side;
    }
    @Override
    public double perietr () {
        return side * 4;
    }
    @Override
    public String toString() {
        return "Info about name " + name + ": \n Area: " + area() + "\n Perimetr: " + perietr() + "\n Side: " + side;
    }

}
