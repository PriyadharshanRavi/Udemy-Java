package com.priyan;

public class Main {

    public static void main(String[] args) {
        Bankaccount archanaAccount = new Bankaccount(123456789, 0.0, "Archana S",
                "archana_s@gmail.com", 987654321);
        System.out.println("welcome " + archanaAccount.getCustomerName());



        archanaAccount.withdraw(100.0);

        archanaAccount.deposit(30000);
        archanaAccount.withdraw(10000);

        archanaAccount.deposit(29999);
        archanaAccount.withdraw(131);

    }
}
