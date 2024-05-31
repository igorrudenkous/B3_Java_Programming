package day32_constructor_chaining_this;

import day26_methods.UsungArrayUtil;

public class Employee {
    //These are instance variables
    String name;
    int id;
    String jobtitle;
    double salary;


    public Employee (String name, String jobtitle) {
        this.name = name;
        this.jobtitle = jobtitle;

    }

    public Employee (String name, String jobtitle, int id, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.id = id;
        this.salary = salary;
    }

    public void goToMeeting () {
        System.out.println(name + " is going to the meeting.");
    }

    @Override
    public String toString() {
        return name + " - " + jobtitle + " - " + id + " - " + salary;
    }
}


