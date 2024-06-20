package day39_polymorphism_major.book;

public class JavaTestBook extends EBook {

    boolean isFun;

    @Override
    public void open() {
        System.out.println("Opening Java TextBook");
    }

    @Override
    public void read() {
        System.out.println("Reading Java TextBook");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java TextBook");
    }
}
