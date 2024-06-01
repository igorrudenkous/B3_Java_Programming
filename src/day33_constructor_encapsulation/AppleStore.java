package day33_constructor_encapsulation;

public class AppleStore {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone("iPhone 15 Pro Max", 1345.00);
        System.out.println(phone1);

        Iphone phone2 = new Iphone("iPhone 14 Pro", 1099.00);
        System.out.println(phone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);

    }
}
