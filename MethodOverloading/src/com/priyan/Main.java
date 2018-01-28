package com.priyan;

public class Main {

    public static void main(String[] args) {
        int newScore = calCulateScore("Priyan", 1500);
        System.out.println("New Score is " + newScore);
        calCulateScore(500);
        calCulateScore();

        //challenge
        calcFeetAndInchesToCentimeters(11,12);
        calcFeetAndInchesToCentimeters(100);
    }

    //method overloading
    public static int calCulateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " Scored " + score + " Points ");
        return score * 1000;
    }

    public static int calCulateScore(int score){
        System.out.println("Unknown Player Scored " + score + " Points ");
        return score * 1000;
    }
    public static int calCulateScore(){
        System.out.println("No player name and score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || ((inches < 0) || inches >12)) {
            System.out.println("invalid inputs");
            return -1;
        }

        double centimeters =  (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " +
                " feet and " + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
