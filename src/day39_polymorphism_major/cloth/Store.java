package day39_polymorphism_major.cloth;

import java.awt.image.Kernel;

public class Store {
    public static void main(String[] args) {
        //ALL POSSIBLE REFERENCE TO T-SHORTS
        //#1 - ITSELF
        TShirt t1 = new TShirt();
        t1.wear();
        //#1 - PARENT
        Clothes t2 = new TShirt();
        t2.wear();

        System.out.println("--------------------");

        //ALL POSSIBLE REFERENCE TO JACKET
        //#1 - ITSELF
        Jacket j1 = new Jacket();
        j1.wear();
        j1.putOnHood();
        //#1 - PARENT
        Clothes j2 = new Jacket();
        j2.wear();

        HasHold j3 = new Jacket();
        j3.putOnHood();
        System.out.println("-------------");


        buy(new TShirt());
        buy(new Jacket());

    }
    public static void buy (Clothes closes) { // Asign = Clothes closes = new TShirt();
        if (closes instanceof TShirt) {
            System.out.println("Bought Tshirt");
        } else if (closes instanceof Jacket){
            System.out.println("Bought Jackets");
        }
    }
}
