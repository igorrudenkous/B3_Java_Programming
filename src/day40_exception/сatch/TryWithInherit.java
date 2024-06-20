package day40_exception.сatch;

public class TryWithInherit {
    public static void main(String[] args) {
        try {

        }catch (IndexOutOfBoundsException e) {

        }catch (RuntimeException e) {

        }catch (Exception a) {

        }

        //Parent exception class cannot be before child exception class
        //Because the Parent Excaption will catch whatever Child would cathc as well

    }
}
