package pgupta85_Lab2.src.If_Else;

import java.util.Scanner;

import static java.lang.System.exit;

public class Extra {
    public static void main(String[] args) {

        boolean check = false;
        while (!check) {
            // Declaring and all variable which will be use. Also defining Scanner object called input.
            int num;
            int tensDigit;
            int onesDigit;
            Scanner input = new Scanner(System.in);

            //Asking user to enter number and then storing the number in 'num' variable
            System.out.print("Enter two digit integer number between 11 and 99 inclusive without any zero - ");
            num = input.nextInt();

            //Getting number in ones and tens place from number enter by user.
            //This will make use of modulus operator. We wil take number and mod it by 10, which will gives us number in ones place
            //Then we will substract this number from original number and then divide it by then. As default division will only give us quotient, we will get digits in tens place.
            //we will store the digits in the variable defines in previous part.
            onesDigit = num % 10;
            tensDigit = (num - onesDigit) / 10;

            //Checking is user had enter valid input. We will be using if/else
            //As per requirement, our number should not contain zero in ones and tens place. We will be using inequality '!=' operator.
            //We also want number should be 2 digits only, hence if tens digits is greater than 10, then user has entered more than 2 digits number.

            if (onesDigit != 0 && tensDigit != 0 && tensDigit <10) {

                check = true; //Number has passed the number check

                System.out.println("Number in tens place is: " + tensDigit);
                System.out.println("Number in once place is: " + onesDigit);

                //Taking square of ones and tens digits using Math.pow(a,b) where a is number you want to take power of, while b is power.
                //Example - Math.pow(2,3) - 2 raised to second power which will gives us 8.
                //We will also declaring double variable x & y to store value.
                double x = Math.pow(onesDigit, 2);
                double y = Math.pow(tensDigit, 2);
                double rms = Math.sqrt((x + y) / 2.0);

                //Showing the RMS value to user.
                System.out.printf("RMS of the number is: %.2f", rms);
                exit(0);

            }
            else {
                //Not chaning the value of 'check' as number has failed the test.
                System.out.println("You have enter invalid number");
                System.out.println("lets try again");
            }
        }
        }

    }

