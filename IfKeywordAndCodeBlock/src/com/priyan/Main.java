package com.priyan;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //code block
        if (score < 5000){
            System.out.println("Your Score is less than 5000!!!");
        }else if ((score > 4000) && (score < 5000)){
            System.out.println("its not");
        }else{

            System.out.println("the end");
        }

        if (gameOver = true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final score is " + finalScore);
        }

        //Challange

        int secondScore = 10000;
        levelCompleted = 8;
        bonus = 200;
        int finalScore = secondScore + (levelCompleted * bonus);
        System.out.println("the final score is " + finalScore);
    }
}
