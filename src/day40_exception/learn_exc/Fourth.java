package day40_exception.learn_exc;

public class Fourth {
    public static void main(String[] args) throws InterruptedException {


       try {
           System.out.println("Start");
           Thread.sleep(-200);
           System.out.println("End");
       } catch (Exception e) {
           e.printStackTrace();
       }
        System.out.println("END2");
    }
}
