package day36_inheritance.app;
/*
Create an App class

create variables:
      name (app name), version

create constructor to initialize the variables

create method:
      download()
          Example output: prints $name is downloading version $version
 */
public class App {
    //INSTANCE VARIABLE
    String name;
    double version;

    //INSTANCE CONSTRUCTOR
    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }
    //INSTANCE METHOD
    public void download () {
        System.out.println(name + " Is downloading version " + version);
    }
}
