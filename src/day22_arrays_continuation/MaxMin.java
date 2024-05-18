package day22_arrays_continuation;

public class MaxMin {
    public static void main(String[] args) {
        int [] nums = {550, 144, -90, 120, 500, 10};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int eachNum : nums) {
            if (eachNum > max) {
                max = eachNum;
            }
            if (eachNum < min) {
                min = eachNum;
            }
        }

        System.out.println("MAX - " + max);
        System.out.println("MIN - " + min);
    }
}
