package pgupta85_Lab6.src.Practice;

import java.util.Scanner;

import static pgupta85_Lab6.src.Lab6Q.MyMethod.*;

public class DemoComplexNumberPratik {
    public static void main(String[] args) {
        //calling myHeader to print out Header
        myHeader("Pratik narendra Gupta", 5, 1);
        char choice;
        double xReal, xImaginary;
        double yReal, yImaginary ;
        Scanner input = new Scanner(System.in);
        RecComplexNum x,y;

        //Creating infinite While Loop
        do {
            //Asking user to enter the values and using Scanner to take in input from user.
            System.out.print("Enter x's real value: ");
            xReal = input.nextDouble();
            System.out.print("Enter x's imaginary value: ");
            xImaginary = input.nextDouble();

            System.out.print("Enter y's real value: ");
            yReal = input.nextDouble();
            System.out.print("Enter y's imaginary value: ");
            yImaginary = input.nextDouble();
            x = new RecComplexNum (xReal, xImaginary);
            y = new RecComplexNum (yReal, yImaginary);

            System.out.println("You have entered the following two complex numbers x and y:");
            System.out.print("X = ");
            x.displayRecForm();
            System.out.printf(", magnitude: %.2f, Angle: %.2f", x.getMagnitude(), x.getAngle());
            System.out.print("\ny = ");
            y.displayRecForm();
            System.out.printf(", magnitude: %.2f, Angle: %.2f\n\n", y.getMagnitude(), y.getAngle());

            System.out.println("Complex Number Calculator: ");
            System.out.println("============================");
            System.out.println("a: Addition");
            System.out.println("b: Subtraction");
            System.out.println("c: Division");
            System.out.println("d: Multiplication");
            System.out.println("e: Exit");
            System.out.println("============================\n");

            System.out.print("Enter your Choice: ");
            input.nextLine();
            choice = input.nextLine().charAt(0);

            // System.out.println("\n");

            switch (choice) {
                case 'a':
                    addComplexNumbers(x,y);
                    System.out.printf("x + y: ");
                    break;

                case 'b':
                    System.out.printf("x - y: ");
                    break;

                case 'c':
                    System.out.printf("x / y: ");
                    break;

                case 'd':
                    System.out.printf("x * y: ");
                    break;

                case 'e':
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 'e');

    }


    public static RecComplexNum addComplexNumbers(RecComplexNum x, RecComplexNum y) {
        /*Declaring a RecComplexNum reference variable res to hold on to the result of the addition. This is instantiated with the added values of the fields referred to by x and y*/
        RecComplexNum res = new RecComplexNum(x.getReal()+y.getReal(), x.getImaginary()+y.getImaginary());
        //Return the reference variable res
        return res; }

    public static RecComplexNum subtractComplexNumbers(RecComplexNum x, RecComplexNum y){
        RecComplexNum sub = new RecComplexNum(x.getReal()- y.getReal(), x.getImaginary()-y.getImaginary());
        return sub;
    }

    public static RecComplexNum divideComplexNumbers(RecComplexNum x, RecComplexNum y){
        /*getting the magnitude and angle values after the division operation in division magnitude are divided from each other while the angles are subtracted from each other*/
        double finalMag = x.getMagnitude()/y.getMagnitude();//magnitude after division
        double finalAngle = x.getAngle()-y.getAngle();//angle after division
        /*declaring a PolarComplexForm type reference variable and instantiating it with the final values from above*/
        PolarComplexNumber pc = new PolarComplexNumber(finalMag,finalAngle);
        /*Since the return type is a RecComplexNum type reference variable, declare one, and instantiate it with pc's (see above) real and imaginary value*/
        RecComplexNum res = new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
        //Return RecComplexNum type reference variable
        return res; }


}
