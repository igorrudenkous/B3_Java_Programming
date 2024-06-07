package day35_inheritance_super.book;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        // has access to 5 instance variable

        AudioBook ab1 = new AudioBook();
        // has access to 7 instance variable
        ab1.duration = 100;
        ab1.narrator = "Morgan Freeman";
        ab1.liste();
        ab1.title = "Java is Fun";


        EBook eb1 = new EBook();
        // has access to 8 instance variable

        eb1.size = 54;
        eb1.pages = 600;
        eb1.title = "Soft Skills";
        eb1.read();

        Autor autor1 = new Autor("jojo moyes", 40);

        Book book2 = new Book();
        // has access to 6 instance variable
        book1.author = new Autor("Gabriel Garcia Marquez", 80);
        System.out.println(book1.author);

        AudioBook a2 = new AudioBook();
        a2.author = new Autor("Thomas Jefferson", 70);
        System.out.println(a2.author);
        System.out.println(a2.author.getName());



    }
}
