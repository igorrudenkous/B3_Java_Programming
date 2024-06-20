package day39_polymorphism_major.cloth;

public class Jacket extends Clothes implements HasHold {
    @Override
    public void wear() {
        System.out.println("Wearing a jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting jackets Hood on....");
    }
}
