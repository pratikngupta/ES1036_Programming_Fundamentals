/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 23rd March
 Task: This will help to perform multiplication and division on complex number
 *********************************************************/
package pgupta85_Lab7.src.Q3;
import pgupta85_Lab7.src.Methods.MyMethod;

public class PolarComplexNumber {
    private final double magnitude;
    private final double angle;

    public PolarComplexNumber(){
        magnitude = 0;
        angle = 0;
    }

    public PolarComplexNumber(double mag, double ang){
        magnitude = mag;
        angle = ang;
    }

    public double getRealValue(){
        return (magnitude *MyMethod.myCos(angle));
    }

    public double getImaginaryValue(){
        return (magnitude*MyMethod.mySin(angle));
    }
}
