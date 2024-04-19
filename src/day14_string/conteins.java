package day14_string;

public class conteins {
    public static void main(String[] args) {
        String weather = "Today it was above 70";

        System.out.println(weather.contains("it was"));
        System.out.println(weather.contains("s"));
        System.out.println(weather.contains("70"));
        System.out.println(weather.contains("70") && weather.contains("80"));
    }
}
