package day32_constructor_chaining_this;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public OfferV2 (String company, String location) {
        this.company = company;
        this.location = location;
    }
    //Overloaded constructor
    public OfferV2 (String company, String location, double salary) {
//        this.company = company;
//        this.lacation = lacation;
        this(company, location);
        this.salary = salary;
    }
    //Overloaded constructor
    public OfferV2 (String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
//        this.company = company;
//        this.lacation = lacation;
//        this.salary = salary;
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {
        String info = company + " is lacation in " + location;
        info += "\n" + ((salary > 0) ? salary : "");
        info += "\n" + (isFullTime ? "Full Time" : "Contract");
        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;
    }
}
