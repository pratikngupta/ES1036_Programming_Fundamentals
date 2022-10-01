/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Calculating the multiplication of Matrix using 2d Arrays and loops
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

import pgupta85_Lab8.src.Methods.MyMethod;

public class GradeActivity {
    private double[] grade;
    private double score;
    private int outOf;
    private double percentScore;

    public GradeActivity(){}

    public GradeActivity(double score, int outOf){
        this.outOf = outOf;
        this.score = score;
    }

    public GradeActivity(double[] grade, int outOf){
        this.outOf = outOf;
        this.grade = grade;
        double sum = 0;

        for(int i = 0; i< grade.length; i++){
            sum+= grade[i];
        }

        if(outOf == 100)
            score = sum;
        else
            score = sum/ grade.length;
    }

    public double getScore() {
        return score;
    }

    public String getLetterGrade(){
        percentScore = score/outOf*100;
        if(percentScore >=90) return "A+";
        else if(percentScore >=80) return "A";
        else if(percentScore >=70) return "B";
        else if(percentScore >=60) return "C";
        else if(percentScore >=50) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        //The arguments of String.format() is written in the same way as the arguments of printf()
        return String.format("%.2f (out of %d), Letter Grade: %s [%.2f%%]", score,outOf, getLetterGrade(),percentScore);
    }
}
