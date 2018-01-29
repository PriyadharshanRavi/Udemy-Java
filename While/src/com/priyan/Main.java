package com.priyan;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while (count != 5){
            System.out.println("the count value is " +count );
            count++;
        }
        count = 1;
	    while (true){
	        if (count == 5){
	            break;
            }
            System.out.println("the count value is " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("do count value was " + count);
            count++;
        }while (count !=6);

        int num = 5;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while(num <= finishNumber){
            if (!isEvenNumber(num)){
                num++;
                continue;
            }
            System.out.println("even number " + num);
            num++;
            evenNumberFound++;
            if (evenNumberFound == 5){
                break;
            }


        }
        System.out.println("total even numbers " + evenNumberFound);



    }
    public static boolean isEvenNumber(int num){

        if ((num%2) == 0) {
            return true;
        }
        else {
            return false;
        }

    }

}
