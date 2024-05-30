package day31_constructor;

public class UseCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.model = "Tesla";
        car1.year = 2020;
        car1.fuellevel = 80;
        car1.color = "Red";
        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive();
        car1.drive();

        System.out.println(car1.fuellevel);

        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuellevel);



    }
}
