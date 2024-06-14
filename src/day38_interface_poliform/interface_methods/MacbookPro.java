package day38_interface_poliform.interface_methods;

public class MacbookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("MacboocPro is turn on");
    }
}



class Runner {
    public static void main(String[] args) {
//        System.out.println(MacbookPro.NAME);
//        System.out.println(MacbookPro.OS);

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);


        Mac.company();
//        Mac.faceTime();

        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();
//        obj.company();
    }
}