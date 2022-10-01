/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Abstract class which will return radius and height
 ****************************************************************/

package pgupta85_Lab8.src.Q4;

import pgupta85_Lab8.src.Methods.MyMethod;
public abstract class Geometric3DObject {
    private double r;
    private double h;
    public double PI = Math.PI;

    protected Geometric3DObject() {}

    protected Geometric3DObject(double r,double h) {
        this.r=r;
        this.h=h;
    }

    public double getR() {return this.r;}

    public double getH() {
        return this.h;
    }

    protected abstract double getArea();

    @Override
    public String toString() {
        return String.format("Given: Radius = %.2f cm, Height = %.2f cm\n",r,h);
    }
}
