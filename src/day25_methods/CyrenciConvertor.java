package day25_methods;

public class CyrenciConvertor {
    public static void main(String[] args) {
        System.out.println(convert("euro", 100));
        System.out.println(convert("lira", 100));
        System.out.println(convert("won", 100));
    }
    public static double convert (String currency, double amount) {

        double result = 0;
        switch (currency) {
            case "euro": case "EURO":
                result = amount * 0.92;
                break;
            case "yen":
                result = amount * 154.03;
                break;
            case "lira":
                result = amount * 32.85;
                break;
            case "won":
                result = amount * 1_353.52;
                break;
            case "rupee":
                result = amount * 83.45;
                break;
            default:
                System.out.println("Incorrect");
        }
        return result;
    }
}
