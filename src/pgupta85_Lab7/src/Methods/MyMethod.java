package pgupta85_Lab7.src.Methods;

/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 9th March
 Task: Create a different public method which calculate
 factorial, power, sine and cosine functions.
 ****************************************************************/

//Importing Scanner Class as it is not included by default.

public class MyMethod {

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

    public static double myFactorial(int n){
        if (n==0) return 1;
        double result = n; //Creating variable to store onto calculations
        n--;
        while (n>0){
            result = result *n;
            n--;
        }
        return result;
    }

    public static double myDegreeToRadian(double degree){
        //return (degree*(Math.PI)/180);
        return (Math.toRadians(degree));
    }

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
    
    public static void myHeader(String fullName, int labNum, int quesNum ){
        System.out.println("******************************************************");
        System.out.println(fullName);
        System.out.printf("Lab %d, Question %d\n", labNum, quesNum);
        System.out.println("******************************************************");
    }

    public static void myFooter(String fullName){
        System.out.printf("\n*** Goodbye from %s ***", fullName);
    }


}


