package day38_polymorphism.Animal;

public class Lizard extends Animal {
    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD eat");
    }
}
