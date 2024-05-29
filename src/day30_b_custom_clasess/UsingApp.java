package day30_b_custom_clasess;

public class UsingApp {
    public static void main(String[] args) {
        App app1 = new App();
        App app2 = new App();

        app1.name = "loopcamp";
        app1.version = 2.0;
        app1.isFree = false;

        app2.name = "game";
        app2.version = 1.03;
        app2.isFree = true;

        System.out.println(app1.name);
        System.out.println(app1.version);
        System.out.println(app1.isFree);

        app1.run();
        app1.update();

        System.out.println("-------------");
        app2.run();
        app2.update();

        System.out.println(app1.version);
        System.out.println(app2.version);

        System.out.println("-------------");
        app1.update();
        app2.update();

        System.out.println(app1.version);
        System.out.println(app2.version);

        System.out.println("-------------");
        new App().run();
        new App().name = "Racecar";
        System.out.println(new App().name);


    }



}
