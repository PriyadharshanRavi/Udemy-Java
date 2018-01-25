package com.priyan;

public class Main {

    public static void main(String[] args) {

	    //Addition
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        //Subtraction
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult +  " - 1 = " + result);

        //Multiplication
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        //Division
        previousResult = result;
        result = result / 2;
        System.out.println(previousResult + " / 2 = " + result);

        //Remainder
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        //Increment
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        result++;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);

        //Decrement
        previousResult = result;
        result = result + 7;
        System.out.println(previousResult + " + 7 = " + result);
        result--;
        System.out.println("Result is now " + result);

        //+= -= *= /=
        result += 5;
        System.out.println("Result is now " + result);
        result -=5;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        //==
        boolean isFalse = false;
        if (isFalse == false)
            System.out.println("It is false");

        //!=
        int topScore = 100;
        if (topScore != 100)
            System.out.println("You have not got high score!!!");
        else
            System.out.println("you got a high score!!!");
        //> < >= <=
        if (topScore > 100)
            System.out.println("You have not got high score!!!");
        else
            System.out.println("you got a high score!!!");

        if (topScore < 100)
            System.out.println("You have not got high score!!!");
        else
            System.out.println("you got a high score!!!");

        if (topScore >= 100)
            System.out.println("You have not got high score!!!");
        else
            System.out.println("you got a high score!!!");

        if (topScore <= 100)
            System.out.println("You have not got high score!!!");
        else
            System.out.println("you got a high score!!!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && secondTopScore < 100)
            System.out.println("Top two scorers");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these test is true");

        //ternary operator
        boolean wasFalse = isFalse ? true : false;
        System.out.println(wasFalse);

        double firstDouble = 20;
        double secondDouble = 80;
        double doubleResult = ( firstDouble + secondDouble ) * 25;
        System.out.println("Result is now " + doubleResult);
        doubleResult = doubleResult % 40;
        System.out.println("Result is now " + doubleResult);
        if (doubleResult <= 20)
            System.out.println("This was over the limit");
    }
}
