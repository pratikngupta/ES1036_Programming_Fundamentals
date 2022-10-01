/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Extended class which will return volume and area of cylinder
 ****************************************************************/

package pgupta85_Lab8.src.Q4;

import pgupta85_Lab8.src.Methods.MyMethod;
public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface{

    public RightCylinder() {}

    public RightCylinder(double r, double h) {
        super(r,h);
    }

    @Override
    protected double getArea() {
        return 2*PI*getR()*(getR()+getH());
    }

    public double getVolume() {
        return PI* MyMethod.myPow(getR(),2)*getH();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cylinder's Volume: %.2f cubic cm\nCylinder's surface area: %.2f sq. cm",
                getVolume(),getArea());
    }
}
