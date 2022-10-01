/*******************************************
 * Full Name - Pratik Narendra Gupta
 * Student Number - 251211859
 * 2nd February 2022
 * Import scanner, get input from user and do calculations.
 *********************************************/

package pgupta85_Lab2.src.Q2;

import java.util.Scanner; // importing the scanner as it is not present by default.

public class MathBugs {
    public static void main(String[] args) {
        // Declaring and initializing all variable which will be use. Also defining Scanner object called input.
        int num;
        int tensDigit;
        int onesDigit;
        double x;
        double y;
        double rms;

        //Asking user to enter number and then storing the number in 'num' variable
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter two digit integer number between 11 and 99 inclusive without any zero: ");
        num=input.nextInt();

        //Getting number in ones and tens place from number enter by user.
        //This will make use of modulus operator. We wil take number and mod it by 10, which will gives us number in ones place
        //Then we will substract this number from original number and then divide it by then. As default division will only give us quotient, we will get digits in tens place.
        //we will store the digits in the variable defines in previous part.
        onesDigit = num%10;
        tensDigit = num/10; // or tensDigit = (num-onesDigit)/10;

        System.out.println ("You entered - " + num);
        System.out.println ("Number in tens place is - " + tensDigit);
        System.out.println ("Number in once place is - " + onesDigit);

        //Taking square of ones and tens digits using Math.pow(a,b) where a is number you want to take power of, while b is power.
        //Example - Math.pow(2,3) - 2 raised to second power which will gives us 8.
        //We will also declaring double variable x & y to store value.

        x = Math.pow(onesDigit,2); // or x = onesDigit*onesDigit;
        y = Math.pow(tensDigit,2); // or y = tensDigit*tensDigit;
        rms = Math.sqrt((x+y)/2.0);
        //Showing the RMS value to user.
        System.out.printf("RMS of the number is: %.2f",rms );
    }
}
