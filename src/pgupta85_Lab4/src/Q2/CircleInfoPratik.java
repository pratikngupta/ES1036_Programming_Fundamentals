/****************************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 14th February
        Task: Create a main driver class called CircleinfoPratik
********************************	*********************************/
package pgupta85_Lab4.src.Q2;

import java.util.Scanner; //Import Scanner class as it is not included by default

class CircleInfoPratik {
    public static void main(String[] args) {
        
        //Declare various variable according to their uses type.
        double radius;
        
        //Initiate a Scanner Object for taking input from user when called.
        Scanner input = new Scanner(System.in);
        
        //Calling myHeader for introduction and passing args in brackets.
        myHeader("Pratik Narendra Gupta", 4,2);

        //Asking user to input  the radius of the circle and using Scanner to take input and store it in radius.
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        /*Creating Circle type reference variable, here wheel is used, but it could be any name.
        As we have not created any constructor in Circle class, default constructor will be created. It will assign value of 0 to the radius.*/
        Circle wheel = new Circle();
        wheel.setRadius(radius); //Using setter method to set the radius of the circle.
        
        //Using printf to print the output. %.3f format the double data type to print only 3 decimals place.
        System.out.printf("\nThe radius of the circle is %.3f",wheel.getRadius()); //using wheel.getRadius to get the area of circle.
        //System.out.printf("\nThe radius of the circle is %.2f",wheel.radius); As radius is public variable it could also be directly access from other class.
        System.out.printf("\nThe area of the circle is %.3f",wheel.getArea()); //using wheel.getArea to get the area of circle.
        System.out.printf("\nThe diameter of the circle is %.3f",wheel.getDiameter()); //using wheel.getDiameter to get the diameter of circle.
        System.out.printf("\nThe circumference of the circle is %.3f",wheel.getCircumference()); //using wheel.getCircumference to get the circumference of circle.
        
        //Calling myFooter for ending signature.
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