/******************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 23rd March
 Task: BinaryToDecimal class according to UML diagram given.
 *********************************************************/
package pgupta85_Lab7.src.Q2;

import pgupta85_Lab7.src.Methods.MyMethod;
import java.util.Arrays;

public class BinaryToDecimal {

    //Private integers array field with size of 4
    private int [] binaryArray = new int[4];

    //Constructor without argument will assign all field values to zero.
    public BinaryToDecimal(){
        Arrays.fill(binaryArray, 0);
    }

    //a constructor with an integer type array parameter; It will accept int array as argument and use arraycopy to copy the data to binaryarray
    public BinaryToDecimal(int [] array){
        if (array.length>4){
            System.arraycopy(array,0,binaryArray,0,binaryArray.length);
            doubleTheSizeZeroPadding();
            reverseArray();
        }
        System.arraycopy(array,0,binaryArray,0,array.length);
    }

    //This method will use for loop to print out array in specific format.
    public void displayArray(){
        System.out.print("[");
        for (int i : binaryArray) {
            System.out.printf("%d ", i);
            //System.out.println(binaryArray[n]);
        }
        System.out.print("\b]");
    }

    ///It will use for loop to get decimal value of array. It will return the value.
    public double getDecimalValue(){
        int power= (binaryArray.length)-1;
        int n;
        double value = 0;
        for (n=0; n<binaryArray.length; n++){
            value = value + MyMethod.myPow(2, power) * binaryArray[n];
            power--;
        }
        return value;
    }

    //It will double the size of the array and do zero padding on the left-hand side.
    public void doubleTheSizeZeroPadding() {
        int[] doubleSize = new int[2*binaryArray.length];
        System.arraycopy(binaryArray, 0, doubleSize, binaryArray.length, binaryArray.length);
        binaryArray = doubleSize;
        doubleSize = null;
    }

    public int [] reverseArray(){
        int[] reverseArray = new int[binaryArray.length];
        int i, j;
        i = 0;
        j = (binaryArray.length-1);
       // displayArray();
        while (j>0){
            reverseArray[i]=binaryArray[j];
            i++;
            j--;
        }
        binaryArray = reverseArray;
        reverseArray = null;
        return binaryArray;
    }

    //This method will shift the array one unit to the right. It means value at array[0] will be moved to array[1]
    public void shiftRight(){
        int temp = binaryArray[7]; //Declaring and initializing temp variable to store the value

        for (int i = 7; i>0; i-- ){
            binaryArray[i] = binaryArray[i-1];
        }
        binaryArray[0]=temp;
        displayArray();
    }

    // shuffleArray() will shuffle the array when it is called
    public void shuffleArray(){
        int j; int temp;
        for(int i = 0; i<binaryArray.length; i++) {
            j = (int)(Math.random()*binaryArray.length);
            temp = binaryArray[i];
            binaryArray[i]= binaryArray[j];
            binaryArray[j]=temp;
        }
        displayArray();
    }
}
