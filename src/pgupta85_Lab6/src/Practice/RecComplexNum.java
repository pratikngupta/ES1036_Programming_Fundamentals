package pgupta85_Lab6.src.Practice;

public class RecComplexNum {

    //Declaring private variable.
    private final double real;
    private final double imaginary;

    //Creating constructor with no args but will assign all private variable zero when called.
    public RecComplexNum(){
        real = 0;
        imaginary = 0;
    }
    //Creating constructors with 2 args, which will assign those value to private variable.
    public RecComplexNum(double re, double im){
        real = re;
        imaginary = im;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //Method, when call will return the magnitude of complex number.
    public double getMagnitude(){
        return (Math.sqrt((Math.pow(real,2))+(Math.pow(imaginary,2))));
    }

    //Method, When call whill return the angles of complex number.
    public double getAngle(){
        return (Math.toDegrees(Math.atan2(imaginary,real)));
    }

    //Method, Whem called, it will print out the complex number on terminal.
    public void displayRecForm(){
        //using if/else statement to figure out that imaginary part of complex number is negative or positive.
        if (imaginary<0){
            System.out.printf("%.2f - %.2fi", real,(imaginary*-1));
        }
        else{
            System.out.printf("%.2f + %.2fi", real, imaginary);
        }
    }
}