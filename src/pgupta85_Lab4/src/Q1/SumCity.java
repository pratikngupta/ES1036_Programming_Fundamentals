/******************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 12th February
        Task: Create multiple method and call them when required.
*********************************************************/

package pgupta85_Lab4.src.Q1;

import java.util.Scanner; //Import Scanner class as it is not included by default.

public class SumCity {

    //Main Driver method
    public static void main(String[] args) {
        //Declare various variable according to their uses type.
        int charReturn;
        float num1, num2;
        char char1, char2;
        String name;
        
        //Initiate a Scanner Object for taking input from user when called.
        Scanner input = new Scanner(System.in);

        //Calling myHeader for introduction and passing args in brackets.
        myHeader("Pratik Narendra Gupta", 4, 1);

        //Part 1, Getting 2 real number from user and calling method sumValue(float, float)to add them up and return value as a float.
        System.out.print("Part 1\nEnter First real number: ");
        num1 = input.nextFloat();
        System.out.print("Enter Second real number: ");
        num2 = input.nextFloat();
        //Using printf to print out the information, %.2f is used to format the float value to 2 decimal place.
        System.out.printf("Sum of %.2f and %.2f is: %.2f\n",num1,num2, sumValues(num1,num2));
        
        //Part 2, getting 2 character and calling method sumValues(char, char) to add them up and return the value as an int.
        System.out.print("\nPart 2\nEnter First character: ");
        char1 = input.next().charAt(0);
        System.out.print("Enter Second Character: ");
        char2 = input.next().charAt(0);
        charReturn=sumValues(char1,char2);
        //Using printf to print out the information, %.2f is used to format the float value to 2 decimal place.
        System.out.printf("The sum of character %c and %c is: %c and integer equivalent value is %d\n", char1,char2,(char)charReturn, charReturn);

        //Part 3, Getting User's full name and calling sumValue(String,String) to add two string and return the value.
        input.nextLine(); //Dummy
        System.out.print("\nPart 3\nEnter your Full Name: ");
        name = input.nextLine();
        //Using printf to print out the information, %.2f is used to format the float value to 2 decimal place.
        System.out.printf(sumValues("I am ",name));

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

    //Part 1, Creating a method called sumValues(float, float) which will accept 2 float and return float value when called
    public static float sumValues (float num1, float num2){
        return (num1+num2);
    }

    //part 2, Creating a method called sumValues(char, char) which will accept 2 char and return int value when called
    public static int sumValues (char char1, char char2){
        return  (char1 + char2);
    } 
    //Part 3, Creating a method called sumValues(string, string) which will accept 2 string and return string value when called
    public static String sumValues(String I, String name) {
        return (I+name);
    }
}
