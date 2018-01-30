package com.priyan;

public class Bankaccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Amount deposited! Balance: " + this.balance);
    }

    public void withdraw(double withdraw){
        if (this.balance >= withdraw){
            this.balance -= withdraw;
            System.out.println("the remaining balance is " + this.balance);
        }else{
            System.out.println("insufficient balance");
        }

    }


    //accountnumber
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    //balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //customername
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //phonenumber
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
