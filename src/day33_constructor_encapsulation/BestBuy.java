package day33_constructor_encapsulation;

public class BestBuy {
    String locations;
    static String headquarters = "Riechfild, 7654 Pen Ave, US";
    static int numOfcomp = 100;
    static String specialDay = "Wednesday";

    public BestBuy (String locations) {
        this.locations = locations;
    }

    public  void  openStore () {
        System.out.println("Opening location - " + locations);
    }

    public static void reStock () {
        System.out.println("To day is - " + specialDay + ", special day and we are restocking");
        numOfcomp = 200;


    }
}
