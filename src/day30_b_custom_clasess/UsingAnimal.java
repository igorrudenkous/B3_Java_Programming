package day30_b_custom_clasess;

public class UsingAnimal {
    public static void main(String[] args) {
       Animal animal1 = new Animal();
        animal1.population = 100000;
        animal1.species = "Bird";

        System.out.println(animal1.population);
        System.out.println(animal1.species);

    }
}
