package day33_constructor_encapsulation;

import day32_constructor_chaining_this.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffice {
    public static void main(String[] args) {
        Offer first = new Offer("Apple", "California", 100_000, true, 15);
        System.out.println(first);


        ArrayList <Offer> offerList = new ArrayList<>();
        offerList.add(first);

        offerList.add(new Offer("Amazon", "Sietle", 112_012, true, 13));
        System.out.println(offerList);

        System.out.println("-----------------------");

        Offer [] moreOffers = {
                new Offer("Google", "California", 80_000, false, 20),
                new Offer("Tesla", "Texas", 99_000, true, 13),
                new Offer("Zoom", "California", 112_000, false, 8),
                new Offer("Facebook", "Texas", 150_000, true, 10),
        };

        System.out.println(Arrays.toString(moreOffers));

        offerList.addAll(Arrays.asList(moreOffers));

        System.out.println("-----------------------");

        ArrayList <Offer> salaryMoreList = new ArrayList<>(offerList);
        salaryMoreList.removeIf(eachOffer -> eachOffer.salary < 130_000);
        System.out.println(offerList);


        ArrayList <Offer> fullTimeList = new ArrayList<>(offerList);
        fullTimeList.removeIf(eachFullTime -> !eachFullTime.isFullTime);
        System.out.println(offerList);





    }
}
