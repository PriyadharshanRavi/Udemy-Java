package com.priyan;

public class Main {

    public static void main(String[] args) {
	    //first parameter
        VipCustomer archana = new VipCustomer();
        System.out.println(archana.getName());

        VipCustomer priyan = new VipCustomer("priyan", 50000.00);
        System.out.println(priyan.getEmail());

        VipCustomer paapa = new VipCustomer("paapa", "paapa@gmail.com", 25000.0);
        System.out.println(paapa.getEmail());
    }
}
