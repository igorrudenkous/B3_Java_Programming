package day32_constructor_chaining_this;

public class EmployeeV2 {
    String name;
    int id;
    String jobtitle;
    double salary;


    public EmployeeV2 (String name, String jobtitle) {
        this.name = name;
        this.jobtitle = jobtitle;

    }

    public EmployeeV2 (String name, String jobtitle, int id, double salary) {
//        this.name = name;
//        this.jobtitle = jobtitle;
        this(name, jobtitle);
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

