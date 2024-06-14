package day33_constructor_encapsulation.login;

public class LoginUser {
    public static void main(String[] args) {
        Login person1 = new Login("Loopcamp", "LoopAcadem05");

//        System.out.println(person1.username);
//        System.out.println(person1.password);

        System.out.println(person1.getPassword("Loopcamp"));
        person1.setPassword("Loop!camp");
        System.out.println(person1.getPassword("Loop!camp"));
    }
}
