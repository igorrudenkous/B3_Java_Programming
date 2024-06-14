package day38_polymorphism.Animal;

public class Reptile {
    public static void main(String[] args) {
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        System.out.println(l1.name);




       Wild r1 = new Wild();
        r1.eat();
        r1.name = "Reptile";
        System.out.println(r1.name);



        Animal l2 = new Lizard();
        l2.eat();
//        Animal r2 = new Reptile();
//        r2.eat();



    }
}
