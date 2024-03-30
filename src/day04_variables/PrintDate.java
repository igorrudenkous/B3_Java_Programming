package day04_variables;

public class PrintDate {
    public static void main(String[] args) {
        int month = 3;
        int day = 27;
        int year = 2824;

        System.out.println(STR."\{month}/\{day}/\{year}");
        System.out.println(month + "\\" + day + "\\" + year);
        System.out.println(month + "-" + day + "-" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "<>" + day + "<>" + year);
    }
}
