/*******************************************
 * Full Name - Pratik Narendra Gupta
 * Student Number - 251211859
 * 2 February 2022
 * Declaring and initializing the variable and then using println to print it on screen.
 *********************************************/

package pgupta85_Lab2.src.Q1;

public class MyMoney {
    public static void main(String[] args) {
        String myName = "Pratik Narendra Gupta";
        int myAge = 18; // Using int as our data is whole number.
        double mySalary = 100000.0; // using double as 100000.0 is big number for float and it has decimals so int won't work

        // Using println to print on output. And using Escape Sequence like \n to move the cursor to the next line.
        System.out.println("My name is " + myName + ", my age is " + myAge + " and\nI hope to earn $" + mySalary + " per year");
    }
}
