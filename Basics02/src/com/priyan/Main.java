package com.priyan;

public class Main {

    public static void main(String[] args) {
        //1.Create a byte variable and set it to any valid byte number
        byte myByteNumber= 100;

        //2.Create a short variable and set it to any valid short number
        short myShortNumber= 3256;

        //3.Create an int variable and set it to any valid int number
        int myIntNumber= 5000;

        //4.Create a variable of type long, make it equal to 50000 +
        // 10 times the sum of the byte, plus the short plus the int

        long myLongNumber= 50000 + (10 * (myByteNumber + myShortNumber + myIntNumber));
        System.out.println("my final answer is " + myLongNumber);
    }
}
