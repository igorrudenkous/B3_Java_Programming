package day33_constructor_encapsulation.packege_traffic;

public class TrafficLight {
    private String color;

    public TrafficLight (String color) {
        setColor(color);

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color) {
            case "yellow":
            case "green":
            case "red":
                this.color = color;
        }

    }




}
