/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 2th March
 Task: Write a program to perform arithmetic operations (addition and multiplication) on complex numbers.
 *********************************************************/
package pgupta85_Lab5.src.Q2;

import java.util.Scanner;

public class ComplexNumberDemoPratik {
    public static void main(String[] args) {
        //Calling myHeader to print out the header.
        myHeader("Pratik narendra Gupta", 5, 2);

        //Declaring variable for use in future.
        double xReal, xImaginary;
        double yReal, yImaginary;

        //Creating Scanner object.
        Scanner input =new Scanner(System.in);

        //Creating ComplexNumber type reference variables x and y.
        ComplexNumber x,y;

        //ASking user to enter the values and using Scanner to take in input from user.
        System.out.print("Enter x's real value: ");
        xReal = input.nextDouble();
        System.out.print("Enter x's imaginary value: ");
        xImaginary = input.nextDouble();

        System.out.print("Enter y's real value: ");
        yReal = input.nextDouble();
        System.out.print("Enter y's imaginary value: ");
        yImaginary = input.nextDouble();

        //Calling constructor to assign the value
        x = new ComplexNumber(xReal,xImaginary);
        y = new ComplexNumber(yReal,yImaginary);

        //Displaing the complex number in a+bi from by calling displayRecForm using respective reference variable.
        System.out.println("\nYou have enter the following two complex number");
        System.out.print("X = ");
        x.displayRecForm();
        System.out.print("\ny = ");
        y.displayRecForm();

        //Creating 2 more refrerence variable and passing them parameter.
        //Note: If there are two complex numbers x = a + bi, and y = c + di, then, x + y = (a + c) + (b + d) i.
        ComplexNumber addRes = new ComplexNumber((xReal+yReal),(xImaginary+yImaginary));
        //Note: If there are two complex numbers x = a + bi, and y = c + di, then, x * y = (ac - bd) + (bc + ad) i
        ComplexNumber mulRes = new ComplexNumber(((xReal*yReal)-(xImaginary*yImaginary)),((xReal*yImaginary)+(xImaginary*yReal)));

        //Displaying the result to user using printf and println and calling getMagnitude and getAngle with respective reference variable.
        System.out.println("\n\nHere are the result of the arithmetic operation");
        System.out.print("x + y = ");
        addRes.displayRecForm();
        System.out.printf(", Magnitude: %.2f, Angle: %.2f", addRes.getMagnitude(),addRes.getAngle());
        System.out.print("\nx * y = ");
        mulRes.displayRecForm();
        System.out.printf(", Magnitude: %.2f, Angle: %.2f", mulRes.getMagnitude(),mulRes.getAngle());

        //Printing out the footer by calling myFooter
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
        System.out.printf("\n\n*** Signing off - %s ***", fullName);
    }
}
