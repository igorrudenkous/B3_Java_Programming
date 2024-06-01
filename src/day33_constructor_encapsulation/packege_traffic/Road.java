package day33_constructor_encapsulation.packege_traffic;

public class Road {
    public static void main(String[] args) {

//        light.color = "Red";
//        System.out.println(light.color);
//
//        light.color = "Purple";
//        System.out.println(light.color);

        TrafficLight light = new TrafficLight("yellow");
        System.out.println(light.getColor());
    }

}
