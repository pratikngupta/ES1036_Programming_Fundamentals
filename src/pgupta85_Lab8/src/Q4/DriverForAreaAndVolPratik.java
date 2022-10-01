/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Main class with driver method used for calculating the volume of cylinder and cone.
 ****************************************************************/

package pgupta85_Lab8.src.Q4;

import pgupta85_Lab8.src.Methods.MyMethod;
public class DriverForAreaAndVolPratik {
    public static void main(String[] args) {
        MyMethod.myHeader("Pratik Narendra Gupta",8,4);

        double r = Math.random()+2;
        double h = Math.random()*3+4;

        Geometric3DObject cone = new RightCircularCone(r,h);
        Geometric3DObject cylinder = new RightCylinder(r,h);

        printResult(cone);
        System.out.println();
        printResult(cylinder);

        MyMethod.myFooter("Pratik Narendra Gupta");
    }

    public static void printResult(Geometric3DObject obj) {
        System.out.println(obj.toString());
    }
}
