package day34_static_a;
/*
/*
    - other methods methods:

        - calculateArea()
            calculate and return the area of a Square

        - calculatePerimeter()
            calculate and return the perimeter of a Square

        - toString()
            print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

 */

public class Square {
    private int side;

    public Square (int side) {
        setSite(side);
    }

    public int getSide() {
        return side;
    }

    public void setSite(int side) {
        if (side > 0)
            this.side = side;
    }

    public int calculateArea (int side) {
        return side * side;
    }

    public int calculatePerimetr (int side) {
        return side * 4;
    }

    public String toString () {
        String info = "Square Info - Side - " + side + "| Area:  " + calculateArea(side) + " | Perimetr: " + calculatePerimetr(side);
        return info;
    }
}
