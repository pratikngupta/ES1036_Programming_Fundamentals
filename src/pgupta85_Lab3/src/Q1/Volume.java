
/* *****************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 8th February
        Task: Get height and radius of cone from user and
              calculate the volume of the cone
*********************************************************/
package pgupta85_Lab3.src.Q1;

import java.util.Scanner; //Import Scanner as it is not included by default

public class Volume {

    //Creating a method called introduction which will print out name, student number and brief description of task when it is called
    public static void introduction (){
        //Using println and printf to print out on display
        System.out.println("******************************************************");
        System.out.println("Name: Pratik Narendra Gupta");
        System.out.println("Student ID: 251211859");
        System.out.println("Date: 8th February");
        System.out.println("Task: Get height and radius of cone from user and \n\t  calculate the volume of the cone");
        System.out.println("******************************************************\n");
    }

    public static void main(String[] args) {

        //Declaring variable as float as we will only be working with 2 decimals places
        float height;
        float radius;
        float volume;

        //Calling introduction method to print out description.
        introduction();

        // Creating a scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Asking user to enter height of the cone
        System.out.print("Please enter the height of the cone: ");
        // Getting the input from user and storing it in height variable.
        height = input.nextFloat();

        // Asking user to enter radius of a cone.
        System.out.print("Please enter the radius of the cone: ");
        // Getting the input from user and storing it in radius variable.
        radius = input.nextFloat();

        //Calculating volume of cone. Using Math.PI to get value of pi and using Math.pow to calculate square of radius.
        volume = (float) ((Math.PI)*Math.pow(radius,2)*height)/3;

        //Using printf to display the volume of cone. using %f to format the value to include required number of decimals places.
        System.out.printf("\nThe volume of cone with radius of %.1f and height %.1f is: %.2f cubic cm", radius, height, volume);


    }
}
