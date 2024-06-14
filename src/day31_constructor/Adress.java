package day31_constructor;

public class Adress {
    String street;
    String city;
    String state;
    String zipcode;
//    public Address (String inputStreet, String inputCity, String inputState, String inputZipcode) {
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipcode = inputZipcode;
//    }

    public Adress (String street, String city, String state, String zipcode) {
        this.street = street; // Since LOCAL variable and INSTANCE variable have SAME names, Java will prioritize LOCAL variables. To make difference between them, I used "this" keyword
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public void fullAddress () {
        System.out.println(street + " " + city + " " + state + " " + zipcode);
    }

    @Override
    public String toString() {
        return "Adress: " + street + " " + city + " " + state + " " + zipcode;
    }
}


class Test {
    public static void main(String[] args) {
        Adress obj = new Adress("123 Test", "Fairfax", "VA", "12345");

        System.out.println(obj.city);// Fairfax

        obj.city = "Falls Church";  // this.city = "Falls Church";
        System.out.println(obj.city);

        obj.fullAddress();
        System.out.println(obj);
    }
}
