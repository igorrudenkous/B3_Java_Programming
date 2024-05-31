package day32_constructor_chaining_this;

public class Offer {
    String lacation;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer (String company, String lacation) {
        this.company = company;
        this.lacation =lacation;
    }
    //Overloaded constructor
    public Offer (String company, String lacation, double salary) {
        this.company = company;
        this.lacation = lacation;
        this.salary = salary;
    }
    //Overloaded constructor
    public Offer (String company, String lacation, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.lacation = lacation;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {
        String info = company + " is lacation in " + lacation;
        info += "\n" + ((salary > 0) ? salary : "");
        info += "\n" + (isFullTime ? "Full Time" : "Contract");
        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;
    }

//        "Offer: " +
//                "\nlacation = " + lacation +
//                "\ncompany = " + company +
//                "\nsalary = " + salary +
//                "\nisFullTime = " + isFullTime +
//                "\nnumberOfPTO = " + numberOfPTO;
//    }
}
