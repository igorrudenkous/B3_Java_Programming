package day33_constructor_encapsulation;

public class UseSong {
    public static void main(String[] args) {

        Song song1 = new Song("Waka waka");
        System.out.println(song1);

        System.out.println();

        Song song2 = new Song("Shape of my hart", 3.32);
        System.out.println(song2);

        System.out.println();

        Song song3 = new Song("Rich Girl", 3.32, "Gwen Stefany", "Pop");
        System.out.println(song3);

    }
}
