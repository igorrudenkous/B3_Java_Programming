package day36_inheritance.app;

public class AppStore {
    public static void main(String[] args) {
        Instagram inst1 = new Instagram(4.53);
        System.out.println(inst1.name);
        System.out.println(inst1.version);
        inst1.postPicture();

        YouTube yout1 = new YouTube(5.001);
        System.out.println();
        System.out.println(yout1.name);
        System.out.println(yout1.version);
        yout1.watchVideo();

    }
}
