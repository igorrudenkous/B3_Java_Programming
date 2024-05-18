package day23_multidimantion_arrays;

public class AWS {
    public static void main(String[] args) {
    String app = "etsy";
    String zones = "us-east1, us-west1, us-west2, us-west3";
    String [] allZones = zones.split(",");


    for (String eachZone : allZones) {
        System.out.println(app + " is deploing on " + eachZone);

    }
// Variant 2 same result
        System.out.println();
    for (int i = 0; i < allZones.length; i++) {
        System.out.println(app + " is deploing on " + allZones[i]);

        }

    }
}
