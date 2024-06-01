package day33_constructor_encapsulation.bank_account;

public class Bank {
    String accountNumber;
    String routingNumber;

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        if (routingNumber.length() == 9) {
            this.routingNumber = routingNumber;
        } else {
            System.out.println("Not correct amount digits");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 17 && accountNumber.length() <= 17) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Not correct digits count");
        }

    }
}
