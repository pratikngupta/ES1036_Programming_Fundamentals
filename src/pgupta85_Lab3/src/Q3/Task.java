/* *****************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 8th February
        Task: Convert cm to inch by calling method.
*********************************************************/

package pgupta85_Lab3.src.Q3;

import java.util.Scanner;

public class Task {

    //creating a method call myHeader which will accept my name, lab number and question number than input when called/
    public static void myHeader(String fullName, int labNum, int quesNum ){
        System.out.println("******************************************************");
        System.out.println(fullName);
        System.out.printf("Lab %d, Question %d\n", labNum, quesNum);
        System.out.println("******************************************************");
    }

    //Creating a method called myFooter which accepts my name as input
    public static void myFooter(String fullName){
        System.out.printf("\n*** Signing off - %s ***", fullName);
    }

    //Creating a cmToInchConverter method which accepts float and will return result.
    public static float cmToInchConverter(float cm){
        return  (float) (cm/2.54);
    }

    public static void main(String[] args) {
        //Declaring Variable
        String fullName;
        int labNum, questNum;
        float cm, inch;

        //Creating a scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Calling myHeader to print out description. fullName, labNum and quesNum is pass to the method
        myHeader("Pratik Narendra Gupta", 3,3);

        //Asking user to enter cm value.
        System.out.print("\nEnter the length value in cm: ");
        cm = input.nextFloat();

        //Passing cm value to method and saving return value to inch
        inch = cmToInchConverter(cm);

        //Using printf to print out final grade and using %.2f formatter to only display 2 decimals places.
        System.out.printf("%.2f cm = %.2f inch\n", cm, inch);

        //Calling myFooter to print out
        myFooter("Pratik Narendra Gupta");
    }
}
