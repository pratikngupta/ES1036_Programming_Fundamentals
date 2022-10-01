/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Extended class which will return the volume and area of right cylinder cone
 ****************************************************************/

package pgupta85_Lab8.src.Q4;

import pgupta85_Lab8.src.Methods.MyMethod;
public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface{

    public RightCircularCone() {}

    public RightCircularCone(double r,double h) {
        super(r,h);
    }

    @Override
    protected double getArea() {
        return PI*getR()*(getR() + Math.sqrt((MyMethod.myPow(getH(),2))+(MyMethod.myPow(getR(),2))));
    }

    public double getVolume() {
        return (PI*MyMethod.myPow(getR(),2))*(getH()/3);
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Cone's Volume: %.2f cubic cm\nCone's surface area: %.2f sq. cm"
                ,getVolume(),getArea());
    }
}
