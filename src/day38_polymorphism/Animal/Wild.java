package day38_polymorphism.Animal;

public class Wild extends Animal {
    int numOfLegs;

    @Override
    public void eat() {
        System.out.println("REPTILE eat");;
    }
}
