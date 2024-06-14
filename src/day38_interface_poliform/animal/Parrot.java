package day38_interface_poliform.animal;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void usewings() {
        System.out.println("Parrot is using wing to fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");
    }

    public void fly () {
        System.out.println("Parrot os flying");
    }

    @Override
    public void hi() {

    }

    @Override
    public void hello() {

    }
}
