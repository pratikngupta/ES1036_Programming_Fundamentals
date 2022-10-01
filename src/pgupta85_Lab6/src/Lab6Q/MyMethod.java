/**************************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 9th March
        Task: Create a different public method which calculate 
              factorial, power, sine and cosine functions.
****************************************************************/

package pgupta85_Lab6.src.Lab6Q;

//Importing Scanner Class as it is not included by default.
import java.util.Scanner;

public class MyMethod {

    public static void main(String[] args) {

        //Declaring and initializing variables for future use.
        char choice;
        double input1;
        int input2;
        
        //Creating Scanner type reference variable which will be used to get input from user.
        Scanner input = new Scanner(System.in);
        
        //calling myHeader to print out Header and passing out parameter.
        myHeader("Pratik narendra Gupta", 5, 1);

        //Creating infinite do While Loop which will stop when user enter 'e'
        do {
            //Creating menu of function and asking user to select by entering letters/
            System.out.println("============================");
            System.out.println("a: Power Function");
            System.out.println("b: Factorial Function");
            System.out.println("c: Sine Function");
            System.out.println("d: Cosine Function");
            System.out.println("e: Exit");
            System.out.println("============================\n");
            //Getting input from user and using .charAt(0) to get first character.
            System.out.print("Enter your Choice: ");
            choice = input.next().charAt(0);
            
            //Calling switch to compare what user has entered. Also converting character to lower case and then comparing it.
            switch (Character.toLowerCase(choice)) {
                //First case, if user enter 'a'; it will take value from user and call myPow method to do the calculation and return the result.
                case 'a':
                    System.out.println("POWER FUNCTION: Calculating x to the power of y.");
                    System.out.print("Enter x: ");
                    input1 = input.nextDouble();
                    System.out.print("Enter y: ");
                    input2 = input.nextInt();
                    //Using printf to print out the result. %.2f is used for 2 decimals place while %d is used for integers.
                    System.out.printf("%.2f^%d = %.2f\n\n", input1, input2, myPow(input1,input2));
                    break;

                //if user enter b; it will take value from user and call myFactorial method to do the calculation and return the result.
                case 'b':
                    System.out.println("FACTORIAL FUNCTION: Calculating factorial of n.");
                    System.out.print("Enter n: ");
                    input2 = input.nextInt();
                    //Using printf to print out the result. %.2f is used for 2 decimals place while %d is used for integers.
                    System.out.printf("%d! = %.2f\n\n",input2, myFactorial(input2));
                    break;

                //if user enter c; it will take value from user and call mySin method to do the calculation and return the result.
                case 'c':
                    System.out.println("SINE FUNCTION: Calculating sin(k) degree.");
                    System.out.print("Enter k in degree: ");
                    input1 = input.nextDouble();
                    //Using printf to print out the result. %.2f is used for 2 decimals place.
                    System.out.printf("Sin(%.2f) degree = %.2f\n\n", input1, mySin(input1));
                    break;
                
                //if user enter d; it will take value from user and call myCos method to do the calculation and return the result.
                case 'd':
                    System.out.println("COSINE FUNCTION: Calculating cos(m) degree.");
                    System.out.print("Enter m in degree: ");
                    input1 = input.nextDouble();
                    //Using printf to print out the result. %.2f is used for 2 decimals place.
                    System.out.printf("cos(%.2f) degree = %.2f\n\n", input1, myCos(input1));
                    break;

                //If user enter 'e', it will just cause loop to break and end the program.
                case 'e':
                    break;

                //If user does not enter any valid choice then it will just display invalid choice and ask user to enter value again.
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 'e'); //choice == 'e' then loop will be broken.

        //Calling myFooter to print out ending lines.
        myFooter("Pratik Narendra Gupta");
    }

    //Creating myPow method which accepts double and int as arguments and will return double.
    public static double myPow(double x, int y) {
        double result = 1;
        //Checking first if y is equal to zero.
        if (y==0){
            return result;
        }
        else {
            //If y !=o then we are creating while loop, and then we compare sign of y.
            //We created a while loop which will continue to run until y value is not equal to zero.
            while (y != 0) {
                if (y > 0) {
                    result = result * x;
                    y--;
                }
                else {
                    result = result / x;
                    y++;
                }
            }
        }
        return result;
    }

    //Creating myFactorial method which will accept int value and return factorial of this. This is done with help of while loop.
    //Here we are making an assumption that user will always enter positive int.
    public static double myFactorial(int n){
        double result = n; //Creating variable to store onto calculations
        n--;
        while (n>0){
            result = result *n;
            n--;
        }
        return result;
    }

    //Creating myDegreeToRadian method which will accept angles in deg and return equivalent angle in rads.
    public static double myDegreeToRadian(double degree){
        //return (degree*(Math.PI)/180);
        return (Math.toRadians(degree));
    }

    //Creating mySin method which will first call myDegreeToRadian to convert angles from degree to radians.
    //Then with the help of summations we will calculate the sin value.
    //We will be using help of while and if/else loop to calculate the value.
    //Also, other method like myPow and myFactorial which were created earlier were also used instead of using Math.pow
    //If/else is also used to make sure that n value is not equal to zero otherwise we will get infinity error!
    public static double mySin(double x){
        x = myDegreeToRadian(x);
        double result =0;
        int n = 0;
        double numerator;
        double denominator =1;
        while (n<=20){
            numerator = myPow(-1,n);
            if (n!=0){
                denominator = myFactorial(((2*n) + 1));
            }
            result = ((numerator/denominator)*myPow(x,(2*n)+1)) + result;
            n++;
        }

        return result;
    }

    //Creating myCos method which will first call myDegreeToRadian to convert angles from degree to radians.
    //Then with the help of summations we will calculate the cos value.
    //We will be using help of while and if/else loop to calculate the value.
    //Also, other method like myPow and myFactorial which were created earlier were also used instead of using Math.pow
    //If/else is also used to make sure that n value is not equal to zero otherwise we will get infinity error!
    public static double myCos(double x){
        x = myDegreeToRadian(x);
        double result = 0;
        int n = 0;
        double numerator;
        double denominator = 1;

        while (n<=20){
            numerator = Math.pow(-1,n)*Math.pow(x,(2*n));
            if (n!=0) denominator = myFactorial((2*n));
            result += ((numerator/denominator));
            n++;
        }
        return (result);
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
        System.out.printf("\n*** Goodbye from %s ***", fullName);
    }
}
