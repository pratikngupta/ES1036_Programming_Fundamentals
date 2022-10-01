
/* *****************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 8th February
        Task: get grade and weightage from user and
              calculate final grade
*********************************************************/

package pgupta85_Lab3.src.Q2;

import java.util.Scanner; //Import Scanner as it is not included by default

public class WeightedAverage {

    //Creating a method called introduction which will print out name, student number and brief description of task when it is called
    public static void introduction (){
        System.out.println("******************************************************");
        System.out.println("Name: Pratik Narendra Gupta");
        System.out.println("Student ID: 251211859");
        System.out.println("Date: 8th February");
        System.out.println("Task: Get grade and weightage from user and \n\t  calculate final grade");
        System.out.println("******************************************************\n");
    }

    public static void main(String[] args) {

        //Declaring variable as float as we will only be working with 2 decimals places
        int grade1, grade2, grade3;
        float grade1Weight, grade2Weight, grade3Weight;
        float finalGrade;

        //Calling introduction method to print out description.
        introduction();

        //Creating a scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Asking user to enter first grade and weight and then taking the input using scanner
        System.out.print("Input the first grade: ");
        grade1 = input.nextInt();
        System.out.print("Input the first-grade weight: ");
        grade1Weight =input.nextFloat();

        //Asking user to enter second grade and weight and then taking the input using scanner
        System.out.print("Input the second grade: ");
        grade2 = input.nextInt();
        System.out.print("Input the second-grade weight: ");
        grade2Weight =input.nextFloat();

        //Asking user to enter third grade and weight and then taking the input using scanner
        System.out.print("Input the third grade: ");
        grade3 = input.nextInt();
        System.out.print("Input the third-grade weight: ");
        grade3Weight =input.nextFloat();

        //Calculating the final grade and then assigning it to finalGrade variable.
        finalGrade = (grade1*grade1Weight)+(grade2*grade2Weight)+(grade3*grade3Weight);

        //Using printf to print out final grade and using %.2f formatter to only display 2 decimals places.
        System.out.printf("\nThe course grade is: %.2f", finalGrade);

    }
}
