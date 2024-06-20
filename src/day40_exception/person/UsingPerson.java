package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) {
        Person obj = new Person();

        try {
            obj.setName("John");
        } catch (Exception p) {
            System.out.println(p.getMessage());
        }

        System.out.println(obj.getName());

        try {
            obj.setAge(130);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
