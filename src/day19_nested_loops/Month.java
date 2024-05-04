package day19_nested_loops;

public class Month {
    public static void main(String[] args) {
        for (int week = 0; week <= 4; week++) {
            System.out.println("Week" + week);
            for (int days = 1; days <= 7; days++) {
                System.out.println("Days" + days);
            }
        }
    }
}
