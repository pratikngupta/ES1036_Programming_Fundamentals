/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 23rd March
 Task: Writing a code which will display menu and allow user to perform basic mathematical operation on imaginary number
 *********************************************************/
package pgupta85_Lab7.src.Q3;

//Importing methods from other package
import pgupta85_Lab7.src.Methods.MyMethod;
import pgupta85_Lab7.src.Methods.Ask;

public class DemoComplexNumberPratik {

    //Driver Method
    public static void main(String[] args) {

        //Declaring variable for use in the future.
        boolean run = true;
        char choice;
        double xReal, xImaginary;
        double yReal, yImaginary;

        //Calling myHeader to print out header.
        MyMethod.myHeader("Pratik Narendra Gupta", 7, 3);

        //Creating ComplexNumber type reference variables x and y.
        RecComplexNum x = new RecComplexNum(), y = new RecComplexNum();

        do {
            //If segment will only run when code is run first time or user has requested to change value
            if (run){
                //Asking user to enter x and y values
                xReal = Ask.getDouble("Enter x's real value");
                xImaginary = Ask.getDouble("Enter x's imaginary value");
                yReal = Ask.getDouble("Enter y's real value");
                yImaginary = Ask.getDouble("Enter y's real value");

                //Calling constructor to assign the value
                 x = new RecComplexNum(xReal,xImaginary);
                 y = new RecComplexNum(yReal,yImaginary);

                 //Using RecComplexNum t0 display the imaginary number in a + ib form:
                 System.out.println("You have enter following two complex number x and y");
                 System.out.print("x = ");
                 x.displayRecForm();System.out.printf(", magnitude: %.2f, Angle: %.2f degrees", x.getMagnitude(), x.getAngle());
                 System.out.print("\ny = ");
                 y.displayRecForm();
                 System.out.printf(", magnitude: %.2f, Angle: %.2f degrees\n", y.getMagnitude(), y.getAngle());
                 run = false; //setting run to false as this has section has been completed.
            }

            //Printing out the options menu and asking user to select the options
            System.out.print("""
                    
                    Complex Number Calculator:
                    ==============================
                    a: Addition
                    b: Subtraction
                    c: Multiplication
                    d: Division
                    e: Change Number
                    f: exit
                    ==============================
                    """);

            //Getting the choice enter by user!
            choice = Ask.getChar("Enter your choice",0);

            //Using switch and case to evaluate the options selected by user.
            switch (choice) {
                case 'a' -> {
                    System.out.println("Addition");
                    System.out.print("x + y = ");
                    addComplexNumbers(x, y).displayRecForm();
                    System.out.printf(", magnitude: %.2f, Angle: %.2f degrees\n", addComplexNumbers(x, y).getMagnitude(), addComplexNumbers(x, y).getAngle());
                }
                case 'b' -> {
                    System.out.println("Subtraction");
                    System.out.print("x - y = ");
                    subtractionComplexNumbers(x, y).displayRecForm();
                    System.out.printf(", magnitude: %.2f, Angle: %.2f degrees\n", subtractionComplexNumbers(x, y).getMagnitude(), subtractionComplexNumbers(x, y).getAngle());
                }
                case 'c' -> {
                    System.out.println("Multiplication");
                    System.out.print("x * y = ");
                    multiplyComplexNumbers(x, y).displayRecForm();
                    System.out.printf(", magnitude: %.2f, Angle: %.2f degrees\n", multiplyComplexNumbers(x, y).getMagnitude(), multiplyComplexNumbers(x, y).getAngle());
                }
                case 'd' -> {
                    System.out.println("Subtraction");
                    System.out.print("x / y = ");
                    divideComplexNumbers(x, y).displayRecForm();
                    System.out.printf(", magnitude: %.2f, Angle: %.2f degrees\n", divideComplexNumbers(x, y).getMagnitude(), divideComplexNumbers(x, y).getAngle());
                }
                case 'e' -> {
                    run = true;
                    System.out.println();
                }
                case 'f' -> System.out.println("Exit!!!");

                default -> System.out.println("Invalid Choice");
            }

        }while (choice != 'f');

        MyMethod.myFooter("Pratik Gupta");
    }

    public static RecComplexNum addComplexNumbers(RecComplexNum x, RecComplexNum y)
    {
        /*Declaring a RecComplexNum reference variable res to hold on to the result of the addition. This is instantiated with the added values of the fields referred to by x and y*/
        //Return the reference variable add
        return new RecComplexNum(x.getReal()+y.getReal(), x.getImaginary()+y.getImaginary());
    }

    public static RecComplexNum subtractionComplexNumbers(RecComplexNum x, RecComplexNum y) {
        /*Declaring a RecComplexNum reference variable res to hold on to the result of the addition. This is instantiated with the added values of the fields referred to by x and y*/
        //Return the reference variable sub
        return new RecComplexNum(x.getReal() - y.getReal(), x.getImaginary() - y.getImaginary());
    }

    public static RecComplexNum divideComplexNumbers(RecComplexNum x, RecComplexNum y) {
        double finalMag = x.getMagnitude() / y.getMagnitude();//magnitude after division
        double finalAngle = x.getAngle() - y.getAngle();//angle after division
        PolarComplexNumber pc = new PolarComplexNumber(finalMag, finalAngle);
        return new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
    }

    public static RecComplexNum multiplyComplexNumbers(RecComplexNum x, RecComplexNum y) {
        double finalMag = x.getMagnitude() * y.getMagnitude();//magnitude after multiplication
        double finalAngle = x.getAngle() + y.getAngle();//angle after multiplication
        PolarComplexNumber pc = new PolarComplexNumber(finalMag, finalAngle);
        return new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
    }

}