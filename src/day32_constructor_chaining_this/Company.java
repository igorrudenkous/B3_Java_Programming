package day32_constructor_chaining_this;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Igor", "SDET", 12451, 10000.00);
        System.out.println(emp1);

        Employee emp2 = new Employee("Mykki", "QA", 12231, 7000.00);
        System.out.println(emp2);

        System.out.println();

        emp1.goToMeeting();
        emp2.goToMeeting();

        EmployeeV2 ev1 = new EmployeeV2("Winnie", "QE");
        EmployeeV2 ev2 = new EmployeeV2("Winnie", "QE", 32, 20000);

        System.out.println(ev1);
        System.out.println(ev2);

    }
}
