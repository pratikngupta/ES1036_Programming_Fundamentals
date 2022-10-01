/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Working with Files and Arrays
 ****************************************************************/
package pgupta85_Lab8.src.Q2;

//Import Scanner and utility tools require to read the data from file
import pgupta85_Lab8.src.Methods.MyMethod;

import java.util.Scanner;
import java.io.*;

public class WorkingWithFilesAndArray {
    public static void main(String[] args) throws IOException {
        MyMethod.myHeader("Pratik Narendra Gupta", 8,2);

        //Creating file type reference variable and assigning it the file path.
        File file = new File("src/Datafile_Lab8.txt");

        System.out.println("Reading the file...");

        //Creating a Scanner type reference variable which will be used to read the file
        Scanner inputFile = new Scanner(file);
        //Declaring an array with size of 7,
        double[] saleNums = new double[7];
        int i =0;
        //Using While loop to read the file and stop once, it has reach end of the line.
        while (inputFile.hasNext() && i < saleNums.length) {
            saleNums[i] = inputFile.nextDouble();
            i++;
        }
        inputFile.close();

        //Creating WeeklySalesData_Pratik reference variable and passing saleNum as arguments.
        WeeklySaleDate_Pratik sales  = new WeeklySaleDate_Pratik(saleNums);

        //Calling specific method to display required values.
        System.out.println();
        System.out.println("Here is the week's sale-data...");
        sales.displaySaleData();
        System.out.printf("\nHighest weekly Sale: %.2f\n",sales.getHighestSale());
        System.out.printf("Lowest weekly Sale: %.2f\n",sales.getLowestSale());
        System.out.printf("Average weekly Sale: %.2f\n",sales.getAverageSale());
        System.out.printf("Standard Deviation of Weekly Sale: %.2f\n",sales.getStandardDeviation());
        System.out.println("... Updating the file with the above info...");

        //Creating FileWriter type reference variable to write back to file
        FileWriter fw = new FileWriter(file,true);
        PrintWriter appendFile = new PrintWriter(fw);
        appendFile.printf("\nHighest weekly Sale: %.2f\n",sales.getHighestSale());
        appendFile.printf("Lowest weekly Sale: %.2f\n",sales.getLowestSale());
        appendFile.printf("Average weekly Sale: %.2f\n",sales.getAverageSale());
        appendFile.printf("Standard Deviation of Weekly Sale: %.2f\n",sales.getStandardDeviation());
        appendFile.close();
        System.out.println("Closed the file...");

        MyMethod.myFooter("Pratik Narendra Gupta");
    }
}
