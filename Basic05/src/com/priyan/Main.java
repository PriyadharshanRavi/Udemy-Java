package com.priyan;

public class Main {

    public static void main(String[] args) {
        //Primitive data types:
        //byte
        //int
        //float
        //double
        //boolean
        //char
        //short
        //long

        //string
        String myString = "Hola Java";
        System.out.println("The string is :" + myString);
        myString = myString + " and I'm gonna fuck you...";
        System.out.println(myString );
        myString = myString + "\u00AE All Rights Reserved!";
        System.out.println("Final Statement: " + myString);

        String numberString = "1150";
        numberString = numberString + "29.99";
        System.out.println("Lets have fun with numbers: " + numberString);
        //it considers the number given within the quotes as string

        String lastString = "11";
        int myInt = 12;
        lastString = lastString + myInt;
        System.out.println("The Last String is: " + lastString);
        //Since we gave 11 within String it didn't treat it as numbers and the int variable gets converted into text

    }
}
