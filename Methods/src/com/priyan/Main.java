package com.priyan;

public class Main {

    public static void main(String[] args) {

//        calculateScore(true, 5000, 5, 100 );
//        calculateScore(true,10000, 8, 200 );
        //Challenge

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("archana ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("priyan ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("spike ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("paapa ", highScorePosition);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + "has managed to get into position " + position +
        " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if ((playerScore >= 500) && (playerScore < 1000)){
            return 2;
        }
        else if ((playerScore >= 200) && (playerScore < 500)){
            return 3;
        }
        else{
            return 4;
        }
    }

   /* public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        //code block
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final score is: " + finalScore);
            System.out.println("the end of method lesson");
        }*/

    }



