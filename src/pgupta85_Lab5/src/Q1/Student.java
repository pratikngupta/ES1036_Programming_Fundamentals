/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 2th March
 Task: Write a program to display the scores and letter grades of students.
 *********************************************************/

package pgupta85_Lab5.src.Q1;

public class Student {

    //Declaring private variables.
    private final String name;
    private final int studentNumber;
    private final int score;

    //Creating a constructor with 1 arguments which is marks.
    public Student(int marks){
        name = "Harry Potter";
        studentNumber = 12345678;
        score = marks;
    }

    //Creating another constructor with 3 arguments which is nm, sNum, sc
    public Student(String nm, int sNum, int sc){
        name = nm;
        studentNumber = sNum;
        score = sc;
    }

    //Creating public method called printInfo whch will print out the details about student.
    public void printinfo(){
        //Using help of printf to formate, '-' means left align while number specify the width.
        System.out.printf("%-15s%-15d%-3d%-2s", name, studentNumber, score, getLetterGrade());
    }

/*    //Getter Method to return the name when called
    public String getName() {
        return name;
    }

    //Getter method to return the score when Called
    public int getScore() {
        return score;
    }*/

    //Creating a method which will access the score and return out the letter grade.
    public String getLetterGrade(){

        //Using if and else statement to calculate the letter grades and return the letter grade;
        if (score>=90){
            return ("(Letter Grade: A+)");
        }
        else if (score>=80){
            return ("(Letter Grade: A-)");
        }
        else if (score>=70){
            return ("(Letter Grade: B+)");
        }
        else if (score>=60){
            return ("(Letter Grade: B-)");
        }
        else if (score>=50){
            return ("(Letter Grade: C+)");
        }
        else if (score>=40){
            return ("(Letter Grade: C-)");
        }
        else if (score>=30){
            return ("(Letter Grade: D)");
        }
        else if (score>=0){
            return ("(Letter Grade: F)");
        }
        return ("Error");
    }
}
