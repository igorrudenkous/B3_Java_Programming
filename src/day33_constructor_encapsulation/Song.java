package day33_constructor_encapsulation;

public class Song {
    String name;
    double lenght;
    String singer;
    String genre;

    public Song (String name) {
        this.name = name;
    }

    public Song (String name, double lenght) {
        this(name);
        this.lenght = lenght;
    }

    public Song (String name, double lenght, String singer, String genre) {
        this(name, lenght);
        this.singer = singer;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " +
                "\nname - " + name +
                "\nlenght - " + lenght +
                "\nsinger - " + singer +
                "\ngenre - " + genre;
    }
}
//