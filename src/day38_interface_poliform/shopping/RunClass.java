package day38_interface_poliform.shopping;

public class RunClass {
    public static void main(String[] args) {
        Target target = new Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
        target.returnItem();
        System.out.println("---------------");
        Amazon amazon = new Amazon();
        amazon.payForShipping(true);
        amazon.viewCart();
        amazon.buyItem();
        amazon.returnItem();
        amazon.price = 12;
    }
}
