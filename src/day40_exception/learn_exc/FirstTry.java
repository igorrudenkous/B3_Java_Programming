package day40_exception.learn_exc;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First print out");


        String str = "loopcamp";

        try {
            System.out.println(str.charAt(8));

        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
//            System.out.println("Exception is caught");
        }
        System.out.println("Last print out");

    }
}
