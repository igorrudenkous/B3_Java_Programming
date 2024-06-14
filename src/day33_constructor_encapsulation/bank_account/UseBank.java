package day33_constructor_encapsulation.bank_account;

import day10_and_11_if_else.BankAccount;

public class UseBank {
    public static void main(String[] args) {
        Bank obj = new Bank();
//        System.out.println(obj.accountNumber);
//        System.out.println(obj.routingNumber);

        System.out.println(obj.getAccountNumber());
        obj.setRoutingNumber("123456789");
        System.out.println(obj.getRoutingNumber());

        obj.setAccountNumber("1234");
        System.out.println(obj.getAccountNumber());
    }
}
