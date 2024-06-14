package day34_static_a;
/*
 /*

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    */

public class DebitCard {
    long cardNumber;
    String holder;
    String cardType;
    int pin;
    double balance;

    static String accountType;
    static {
        accountType = "Checking";
    }

    public DebitCard(long cardNumber, String holder, double balance) {
        this.holder = holder;
        this.balance = balance;

        if ((cardNumber+"").length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid Card Number!");
        }
    }

    public DebitCard(long cardNumber, String holder, double balance, int pin, String cardType) {
        this(cardNumber, holder, balance);
//        this.cardType = cardType;

        if (cardType.equalsIgnoreCase("MasterCard") || cardType.equalsIgnoreCase("Visa")){
            this.cardType = cardType;
        } else  {
            System.out.println("Invalid Card Type!");
        }

        if ((pin + "").length() == 4){
            this.pin = pin;
        } else  {
            System.out.println("Invalid Pin Lenght!");
        }
    }

    @Override
    public String toString() {
        return "DebitCard: " +
                "\ncardNumber = " + cardNumber +
                "\nholder = " + holder +
                "\ncardType =" + (cardType != null ? cardType : "") +
                "\npin = " + pin +
                "\nbalance = " + balance;
    }
}
