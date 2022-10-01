/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 23rd March
 Task: Writing a code which will display menu and allow user to perform basic mathematical operation on imaginary number
 *********************************************************/
package pgupta85_Lab7.src.Q2;

import pgupta85_Lab7.src.Methods.MyMethod;
import java.util.Random;

public class DemoBinaryToDecimals {
        public static void main(String[] args) {
                //Calling myHeader to print out intro!
                MyMethod.myHeader("Pratik Narendra Gupta", 7, 2);

                //Creating Random reference variable
                Random randomNumbers = new Random();

                //Declaring int array called 'array' with length of 4.
                int [] array = new int[4];
                int [] array2;
                //Randomly assigning value between 0 and 1 to array.
                for (int n = 0; n < array.length; n++){
                        array[n] = randomNumbers.nextInt(2);
                }

//                array[0]=0;
//                array[1]=0;
//                array[2]=0;
//                array[3]=1;

                //Creating BinaryToDecimal reference variable called binary and passing value using constructor.
                //Creating a BinaryToDecimal reference variable called binary.
                BinaryToDecimal binary = new BinaryToDecimal(array);
                System.out.print("The 4 bit number: ");
                binary.displayArray(); //printing out array!
                System.out.print("\nThe corresponding decimal value is: ");
                System.out.print((int) binary.getDecimalValue());

                //Doubling array size! and getting decimal value
                binary.doubleTheSizeZeroPadding();
                System.out.print("\nThe 8 bit number, after the size is doubled and zero padded: ");
                binary.displayArray();
                System.out.print("\nThe corresponding decimal value is: ");
                System.out.print((int) binary.getDecimalValue());

                //Reversing the array and getting decimal value
                System.out.print("\nThe 8 bit number after reversing the array: ");
                array2 = binary.reverseArray(); //calling reverseArray
                binary.displayArray(); //Printing out the reverse array.
                System.out.print("\nThe corresponding decimal value is: ");
                System.out.print((int) binary.getDecimalValue());

                //Declaring second reference variable.
                BinaryToDecimal binary2 = new BinaryToDecimal(array2);
                System.out.println();

                //Shifting array to the right and getting decimal value.
                System.out.print("The 8 bit number after the shift right operation: ");
                binary2.shiftRight();
                System.out.print("\nThe corresponding decimal value is: ");
                System.out.print((int) binary2.getDecimalValue());

                //Shuffling the array and getting decimal value!
                System.out.print("\nThe 8 bit number after the shuffling operation: ");
                binary2.shuffleArray();
                System.out.print("\nThe corresponding decimal value is: ");
                System.out.println((int) binary2.getDecimalValue());

                //Calling myFooter to end the code.
                MyMethod.myFooter("Pratik Narendra Gupta");
        }
}
