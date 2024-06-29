package day44_enum.enum_intro;

import day39_polymorphism_major.book.Book;

public class UsingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.CHROME;


        switch (browser) {
            case EDGE:
            case CHROME:
                System.out.println("Opening CHROME or EDGE bowser");
                break;
            case SAFARI:
                System.out.println("Opening SAFARI bowser");
                break;
            case FIREFOX:
                System.out.println("Opening FIREFOX bowser");

        }
    }
}
