package day40_exception.learn_exc;

public class SecondTry {
    public static void main(String[] args) {

//        String s = "loop";
        try {
            String s = null;
            System.out.println(s.length());

            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[9]);

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception is caught");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out Exception is caught");
        }
        System.out.println("Done");
    }




}
