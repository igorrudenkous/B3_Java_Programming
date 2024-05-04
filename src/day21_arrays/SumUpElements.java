package day21_arrays;

public class SumUpElements {
    public static void main(String[] args) {
        int [] num = {4, 3, 5};
        System.out.println("Total: ");
        System.out.println("Total: " + (num[0] + num[1] + num[2]));


        System.out.println("--------------------------------");
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Total: " + sum);
     }
}
