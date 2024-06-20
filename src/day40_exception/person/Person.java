package day40_exception.person;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (name == null || name.isEmpty()) {
           // System.out.println("Cannot assing");
            throw new Exception("Name cannot be empty");
        } else  {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if (age < 0 || age > 120) {
//            throw new IllegalAccessException("Age must be betwen 0 - 120");
        }
        this.age = age;
    }
}
