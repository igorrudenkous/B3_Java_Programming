package day33_constructor_encapsulation;

public class Iphone {
    String model;
    double price;

    static String company;
    static String os;

//CUSTOM CONSTRUCTOR
    public Iphone (String model, double price) {
        this.model = model;
        this.price = price;
    }

// STATIC BLOCK
    static {
    System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
}

//INSTANCE METHOD
    @Override
    public String toString() {
        return "Iphone Info: " +
                "\nmodel: " + model +
                "\nprice: " + price +
                "\ncompany: " + company;
    }
}
