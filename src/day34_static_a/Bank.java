package day34_static_a;

public class Bank {
    public static void main(String[] args) {
        DebitCard bb1 = new DebitCard(1234567891234567L, "Mose", 100_000_000);
        System.out.println(bb1);


        DebitCard bb2 = new DebitCard(1234567L, "Banya", 100_000);
        System.out.println(bb2);



    }
}
