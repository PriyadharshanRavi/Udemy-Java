package com.priyan;

public class Main {

    public static void main(String[] args) {
        char switchValue = 'A';
        switch (switchValue){
            case 'A':
                System.out.println("value was A");
                break;

            case 'B':
                System.out.println("value was B");
                break;

            case 'C':
                System.out.println("value was C");
                break;

            case 'D':
                System.out.println("value was D");
                break;

            case 'E':
                System.out.println("value was E");
                break;

            default:
                System.out.println("was not A,B,C,D or E");
                break;
        }
        String month = "dec";
        switch(month.toLowerCase()){
            case "jan":
                System.out.println("its jan");
                break;
            case "feb":
                System.out.println("its feb");
                break;
            case "mar":
                System.out.println("its mar");
                break;
            case "apr": case "jun": case "aug": case "sept": case "oct": case "nov":
                System.out.println("its " + month);
                break;
            case "dec":
                System.out.println("its dec");
                break;
            default:
                System.out.println("invalid input");
                break;
        }


    }
}
