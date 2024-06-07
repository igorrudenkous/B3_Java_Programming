package day35_inheritance_super.book;

public class EBook extends Book{
    double size;
    int pages;
    String color;

    public void read () {
        System.out.println("Reading a digital copy of " + title);
    }

}
