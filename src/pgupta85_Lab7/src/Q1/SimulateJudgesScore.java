/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 23rd March
 Task: we will simulate the Winter-Olympic judges' score by randomly generating five (5) scores
 between 7 and 10 (<7=score<10), and then get the final score by discarding the maximum and the minimum scores out of the five.
 *********************************************************/
package pgupta85_Lab7.src.Q1;

import pgupta85_Lab7.src.Methods.MyMethod; //Importing MyMethod required to use math function created in previous lab.

public class SimulateJudgesScore {

    public static void main(String[] args) {
        //Creating a double array with length of 5
        double [] score = new double[5];
        MyMethod.myHeader("Pratik Narendra Gupta", 7, 1);

        populateArray(score); //calling method to populate array

        System.out.println("\nHere are the score from 5 judges:");
        displayArray(score); //Calling displayArray to print out array
        //Using printf with .2f% to display only 2 decimals places
        System.out.printf("""
                
                    Highest Score: %.2f
                    Lowest Score: %.2f
                """, score[getHighest(score)], score[getLowest(score)]);
        System.out.println("Here are score after regrading the highest and lowest scores");
        System.out.printf("\n\tThe final score is: %.2f",finalScore(score));

    }

    public static void populateArray(double[] score){
        int n = 0;
        while (n<score.length){
            score[n] = (Math.random()*3)+7;
            //System.out.println(score[n]);
            n++;
        }
    }

    //This method would print out array using for loop
    public static void displayArray(double[] array){
        System.out.print("[");
        for (int n=0; n<5; n++){
            System.out.printf("%.2f, ", array[n]);
        }
        System.out.print("\b\b]");
    }

    //
    public static double finalScore(double[] array){
        double [] finalScore = new double[5];
        int n;
        double sum=0;
        System.arraycopy(array,0, finalScore, 0, 5);
        int highIndex = getHighest(finalScore);
        int lowIndex = getLowest(finalScore);
        finalScore [highIndex] = 0;
        finalScore [lowIndex] = 0;
        displayArray(finalScore);
        //Calculate the average:
        for (n=0; n<finalScore.length; n++ ){
            sum += finalScore[n];
        }
        return (sum/(n-2));
    }

    public static int getHighest (double[] array){
        int index = 0;
        double highest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getLowest (double[] array){
        int index = 0;
        double lowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
                index = i;
            }
        }
        return index;
    }
}
