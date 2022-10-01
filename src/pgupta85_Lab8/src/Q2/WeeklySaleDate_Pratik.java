/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Calculating the multiplication of Matrix using 2d Arrays and loops
 ****************************************************************/

package pgupta85_Lab8.src.Q2;

import pgupta85_Lab8.src.Methods.MyMethod;

public class WeeklySaleDate_Pratik {

    private double[] sale;

    public  WeeklySaleDate_Pratik() {
        sale = null;
    }

    public WeeklySaleDate_Pratik (double[] sale) {
        this.sale = sale;
    }

    public double getAverageSale(){
        int average = 0;
        for (int i = 0; i< sale.length; i++){
            average += sale[i];
        }
        average = average/ sale.length;
        return average;
    }
    public double getHighestSale(){
        double high = sale[0];
        //Using for loop to find highest sales
        for (int i = 0;i<sale.length;i++) {
            //Using if/else to determine if new value is higher or lower than previous values.
            if (sale[i] > high) {
                high = sale[i];
            }
        }
        return high; //return high value
    }
    public double getLowestSale(){
        double min = sale[0];
        //Using for loop to find highest sales
        for (int i = 0;i<sale.length;i++) {
            //Using if/else to determine if new value is higher or lower than previous values.
            if (sale[i] < min) {
                min = sale[i];
            }
        }
        return min; //return min value
    }
    public void displaySaleData(){
        //Using for loop to display data
        System.out.print("[");
        for (int i = 0;i<sale.length;i++) {
            System.out.printf("%.2f, ",sale[i]);
        }
        //Using Print statement with \b to remove extra brackets at the ends.
        System.out.print("\b\b]");
    }
    public double getStandardDeviation(){
        double value = 0;  //declaring variable to store standard Deviation value.

        //Using for loop to get the sum using SD formula
        for (int i=0;i<sale.length;i++) {
            value += MyMethod.myPow(sale[i]-getAverageSale(),2);
        }
        //implementing the formula (denominator portion)
        value = Math.sqrt(value/sale.length);
        return value;     //return value variable
    }

}
