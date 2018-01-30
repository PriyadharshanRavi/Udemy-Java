package com.priyan;

public class Main {

    public static void main(String[] args) {

        Bankaccount archanaAccount = new Bankaccount();
        archanaAccount.setAccountNumber(123456789);
        archanaAccount.setBalance(0.0);
        archanaAccount.setCustomerName("Archana S");
        archanaAccount.setEmail("archana_s@gmail.com");
        archanaAccount.setPhoneNumber(987654321);
        

        archanaAccount.withdraw(100.0);

        archanaAccount.deposit(30000);
        archanaAccount.withdraw(10000);

        archanaAccount.deposit(29999);
        archanaAccount.withdraw(131);
    }
}
