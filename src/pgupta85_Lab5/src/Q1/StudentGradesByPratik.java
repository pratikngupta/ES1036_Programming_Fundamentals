/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 2nd March
 Task: Write a program to display the scores and letter grades of students.
 *********************************************************/

package pgupta85_Lab5.src.Q1;

import java.util.Scanner;

public class StudentGradesByPratik {
    public static void main(String[] args) {
        //Declaring some variable
        int run=1;
        int harryScore = 0;
        int pratikScore = 0;
        //calling myHeader to print out Header
        myHeader("Pratik narendra Gupta", 5, 1);

        //Using While Statement to run the script 3 times.
        while (run<=3) {

            System.out.printf("Run %d\n",run);
            //Creating another while statement to check if user has entered score between valid range.
            while (true) {

                Scanner input = new Scanner(System.in);
                System.out.println("Initial Setup");
                System.out.print("Enter Score for Pratik: ");
                pratikScore = input.nextInt();
                System.out.print("Enter Score for Harry: ");
                harryScore = input.nextInt();

                //Creating if/else statement to verify that input is within the range,otherwise it will ask user to enter score again.
                if (harryScore>=0 && harryScore<=100 && pratikScore>=0 & pratikScore <=100){
                    break;
                }
                else {
                    System.out.println("Enter valid score between range of 0-100");
                }

            }

            //Creating 2 Student Type reference variable and passing parameter through them
            Student harry = new Student(harryScore);
            Student pratik = new Student("Pratik Gupta", 251211859, pratikScore);

            //Using help of printf to formate, '-' means left align while number specify the width. Then calling printInfo with respective reference variable to print out info
            System.out.println();
            System.out.printf("%-15s%-15s%-3s%-2s\n", "Name", "Student Number", "Score"," (Letter Grade)");
            System.out.println("---------------------------------------------------------");
            pratik.printinfo();
            System.out.println();
            harry.printinfo();
            System.out.println("\n---------------------------------------------------------");

            //Using if/else if/else to figure out who has higher score or both are equal. Then printing the result using println
            if (pratikScore>harryScore){
                System.out.println("Note: Pratik Gupta Score higher than Harry Potter");
            }
            else if (harryScore>pratikScore){
                System.out.println("Note: Harry potter Score higher than Pratik Gupta ");
            }
            else {
                System.out.println("Note: Their score are equal");
            }

            System.out.println("\n###################################################################");

            run++;//increase the value of run by 1.
        }
        //Calling myFooter to print out ending lines.
        myFooter("Pratik Narendra Gupta");
    }

    //creating a method call myHeader which will accept my name, lab number and question number than input when called.
    public static void myHeader(String fullName, int labNum, int quesNum ){
        System.out.println("******************************************************");
        System.out.println(fullName);
        System.out.printf("Lab %d, Question %d\n", labNum, quesNum);
        System.out.println("******************************************************");
    }

    //Creating a method called myFooter which accepts my name as input
    public static void myFooter(String fullName){
        System.out.printf("\n*** Signing off - %s ***", fullName);
    }
}
