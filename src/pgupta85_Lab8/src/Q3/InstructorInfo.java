/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Return instructor name and office location
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

import pgupta85_Lab8.src.Methods.MyMethod;
public class InstructorInfo extends Name{
    private String officeLocation;

    public InstructorInfo() {}

    public InstructorInfo(String fN, String lN, String oL) {
        super(fN,lN);
        officeLocation = oL;
    }

    @Override
    public String toString() {
        return "Instructor's Info: \n"+super.toString()+"\nOffice Location: "+officeLocation;
    }
}
