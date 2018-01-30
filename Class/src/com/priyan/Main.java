package com.priyan;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car suzuki = new Car();
        porsche.setModel("carrera");
        suzuki.setModel("swift");
        System.out.println("model is " + porsche.getModel());
        System.out.println("model is " + suzuki.getModel());


    }
}
