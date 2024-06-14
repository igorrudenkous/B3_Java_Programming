package day33_constructor_encapsulation;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("Fairfax, VA");
        BestBuy store2 = new BestBuy("Minneapolis, MN");
        BestBuy store3 = new BestBuy("Sietle, WA");

        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println();

        store1.headquarters = "Minneapolis";
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println();
        System.out.println(store2.locations);
        store3.headquarters = "8680 Magnpolia Trail, MN";
        System.out.println(store1.locations);
        System.out.println(store2.locations);
        System.out.println(store3.locations);

        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);

        System.out.println("------------------");
        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("------------------");
        BestBuy.reStock();
        store1.reStock();
        System.out.println(store1.numOfcomp);
        System.out.println(store2.numOfcomp);
        System.out.println(store3.numOfcomp);


    }



}
