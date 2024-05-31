package day32_constructor_chaining_this;

public class Food {

    String name;
    int quantity;
    double price;
    double totalprice;

    public Food (String name) {
        this.name = name;
    }

    public Food (String name, int quantity) {
        this(name);
        this.quantity = quantity;

    }

    public Food (String name, int quantity, double price) {
        this(name, quantity);
        this.price = price;
        calculatePrice();
    }

    public void calculatePrice () {
        totalprice = price * quantity;
    }

    @Override
    public String toString() {
        return "Item: " + name + " - " + quantity + " x " + price + " = $" + totalprice;
    }
}
