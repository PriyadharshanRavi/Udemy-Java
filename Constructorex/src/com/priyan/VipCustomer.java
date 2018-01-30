package com.priyan;

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(){
        System.out.println("empty and first constructor called");
        this.name = "default name";
        this.email = "default@email.com";
        this.creditLimit = 50000.00;

    }

    public VipCustomer(String name, double creditLimit) {
        System.out.println("second constructor called");
        this.name = name;
        this.email = "default@gmail.com";
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email, double creditLimit) {
        System.out.println("third constructor called");
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


}
