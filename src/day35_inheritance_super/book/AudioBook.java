package day35_inheritance_super.book;

public class AudioBook extends Book {
    double duration;
    String narrator;

    public void liste () {
        System.out.println("Listening to " + title + " narrated by " + narrator);
    }
}
