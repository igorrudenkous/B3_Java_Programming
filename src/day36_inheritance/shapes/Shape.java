package day36_inheritance.shapes;

public class Shape {
    String name;

    public Shape (String name) {
        this.name = name;
    }
    // This is an area method (general)
    public double area () {
        return 0;
    }

    public double area (double sude) {
        return 0;
    }

    public double perietr () {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
