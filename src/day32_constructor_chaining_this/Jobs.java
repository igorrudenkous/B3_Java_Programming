package day32_constructor_chaining_this;

public class Jobs {
    public static void main(String[] args) {
        Offer o1 = new Offer("Apple", "California");
        System.out.println(o1);

        Offer o2 = new Offer("Apple", "California", 10000.0);
        System.out.println(o2);

        Offer o3 = new Offer("Apple", "California", 10000.0, true, 123);
        System.out.println(o3);
    }
}
