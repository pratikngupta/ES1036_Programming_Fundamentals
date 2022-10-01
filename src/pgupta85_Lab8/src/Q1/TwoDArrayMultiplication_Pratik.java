/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Calculating the multiplication of Matrix using 2d Arrays and loops
 ****************************************************************/
package pgupta85_Lab8.src.Q1;

import pgupta85_Lab8.src.Methods.MyMethod;
import pgupta85_Lab8.src.Methods.Ask;

public class TwoDArrayMultiplication_Pratik {

    public static void main(String[] args) {
        int row1, column1, row2, column2;
        MyMethod.myHeader("Pratik Gupta", 8,1);
        System.out.print("""
                Multiplying two 2D arrays:
                Enter Array 1 info:
                """);
        row1 = Ask.getInt("\tEnter row-size");
        column1 = Ask.getInt("\tEnter Column size");
        System.out.println("Enter Array 2 info: ");
        row2 = Ask.getInt("\tEnter row-size");
        while (row2 != column1){
            System.out.println("\tRow size of the 2nd matrix has to be equal to the column size of first matrix!");
            row2 = Ask.getInt("\tEnter Again");
        }
        column2 = Ask.getInt("\tEnter Column size");

        int [][] array1 = new int[row1][column1];
        int [][] array2 = new int[row2][column2];

        populateArrays(array1);
        populateArrays(array2);

        System.out.printf("\nElements of Array 1, Size[%d x %d]\n", row1,column1);
        displayArrays(array1);
        System.out.printf("\nElements of Array 2, Size[%d x %d]\n", row2,column2);
        displayArrays(array2);

        int [][] result =  multiplyArrays(array1,array2);
        System.out.println("\nMultiplying two arrays [Array 1 x Array 2]..");
        System.out.printf("The resultant size is [%d x %d]\nThe elements are...\n", result.length, result[0].length);
        displayArrays(result);
        MyMethod.myFooter("Pratik Gupta");
    }

    public static void populateArrays (int[][] ma){
        for (int row = 0; row < ma.length; row ++){
            for (int col = 0; col < ma[0].length; col++) {
                ma[row][col]= (int) ((Math.random()*4)+2);
            }
        }
    }

    public static void displayArrays (int[][] ma){
        for (int row = 0; row <ma.length; row++) {
            for (int col = 0; col < ma[0].length; col++) {
                //Column values will be printed in a row with a space in between
                System.out.printf("%3d", ma[row][col]);
            }
            //Cursor will move to the following line after printing each row
            System.out.println();
        }
    }

    public static int[][] multiplyArrays(int[][] a, int[][] b){

        int[][] result = new int[a.length][b[0].length];

        // Multiply the two matrices
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b.length; k++)
                    result[i][j] += a[i][k] * b[k][j];
            }
        }
        return result;
    }
}
