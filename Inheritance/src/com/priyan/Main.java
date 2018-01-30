package com.priyan;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal ("animal",1,1,5,15);

        Dog dog = new Dog("jack",1,15,2,4,1,32,"white");
        dog.eat();
        dog.walk();
        //dog.run();
    }
}
