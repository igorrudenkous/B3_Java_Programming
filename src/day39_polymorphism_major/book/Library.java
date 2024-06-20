package day39_polymorphism_major.book;

public class Library {
    public static void main(String[] args) {
        JavaTestBook book1 = new JavaTestBook();
        book1.name = "JAVA OCA";
        book1.size = 30.0;
        book1.isFun = true;

        book1.read();
        book1.open();
        book1.download();
        System.out.println("------------");
        
        EBook book2 = new JavaTestBook();
        book2.name = "JAVA OCA";
        book2.size = 30.0;
        ((JavaTestBook)book2).isFun = true;

        book2.read();
        book2.open();
        book2.download();

        System.out.println("------------");
        Book book3 = new JavaTestBook();
        book3.name = "JAVA OCA";
        ((JavaTestBook)book3).size = 30.0;
        ((JavaTestBook)book3).isFun = true;

        book3.read();
        ((JavaTestBook)book3).open();
        ((JavaTestBook)book3).download();

        System.out.println("-------------");
        System.out.println(book1 instanceof JavaTestBook);
        System.out.println(book2 instanceof JavaTestBook);
        System.out.println(book2 instanceof EBook);
        System.out.println(book2 instanceof Book);

    }
}
