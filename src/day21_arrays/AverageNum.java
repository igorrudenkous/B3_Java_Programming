package day21_arrays;

public class AverageNum {
    public static void main(String[] args) {
        int [] nums = {10, 15, 5, 6};
        int sum = 0;

//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }

        for (int each : nums) {
            sum += each;

        }
        System.out.println(sum);
    }

}
