/*******************************************
 * Full Name - Pratik Narendra Gupta
 * Student Number - 251211859
 * 21 January 2022
 * Find out Square Root of my last 4 digits number of student ID and add 2022 to last 4 digits of student Number.
 *********************************************/

package pgupta85_Lab1.src.Q3;

public class MyStudentID {
    public static void main(String[] args) {

        // Declaring and initializing the variable myStudentNumber with last 4 digits of my student number.
        int myStudentNumber = 1859;

        //using println to display myStudentNumber on the terminal.
        System.out.println("The last 4 digits of my student number are: " + myStudentNumber);

        //Using println to display the square root of myStudentNumber. The square root is calculated using JAVA Math class.
        System.out.println("The Square root of " + myStudentNumber + " is: " + Math.sqrt(myStudentNumber));

        //Using println to display addition of myStudentNumber and 2022. This is also perform using JAVA Math class.
        System.out.println("The addition of " + myStudentNumber + " and 2022 is: " + Math.addExact(myStudentNumber, 2022));

    }
}
