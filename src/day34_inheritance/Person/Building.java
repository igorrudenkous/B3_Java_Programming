package day34_inheritance.Person;

public class Building {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "general name";
        p.age = 8;
        p.talk();
//        p.study();

        Student s1 = new Student();
        s1.name = "Winnie";
        s1.age = 18;
        s1.talk();
        s1.study();
        s1.ishappy = true;
    }
}
