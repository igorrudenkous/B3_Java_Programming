package day38_interface_poliform.shopping;

public final class Amazon extends OnlineShopping {

    @Override
    public void viewCart() {
        System.out.println("Viweing Amazon Card");
    }

    @Override
    public void payForShipping(boolean hasPrime) {
        System.out.println(hasPrime ? "No coast for shiping" : "Paying for shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy in Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Drop Location");
    }
}
