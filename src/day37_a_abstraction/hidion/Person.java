package day37_a_abstraction.hidion;

public class Person {
    String name = "Micky Mouse";

}

class SecretIdentity extends Person {

}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);


        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}