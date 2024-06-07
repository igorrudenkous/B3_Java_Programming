package day35_inheritance_super.computer;

public class Lab {
    public static void main(String[] args) {
        Computer c1 = new Computer("GeneralOS", 256);

        Windows w1 = new Windows("Windows", 64);

        Mac m1 = new Mac("MacOS", 64);
    }
}
