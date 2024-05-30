package day31_constructor;

public class UseMarker {
    public static void main(String[] args) {

//        Marker marker1 = new Marker();
//        marker1.type = "Dry color";
//        marker1.brand = "Sharpie";
//        marker1.color = "Black";

        Marker marker1 = new Marker("Color", "Parker", "Green");
        System.out.println(marker1);


        Marker marker2 = new Marker("Pen", "Bit", "Blue");
        System.out.println(marker2);
    }
}
