/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Extended class called studentinfo which extend name
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

import pgupta85_Lab8.src.Methods.MyMethod;
public class StudentInfo extends Name{

    private int studentNumber;
    private CourseAndInstructor courseInfo;

    public StudentInfo(){}

    public StudentInfo(String fN,String lN,int sN,CourseAndInstructor cInfo){
        super(fN,lN);
        studentNumber = sN;
        courseInfo = cInfo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStudent Number: "+studentNumber+"\n"+courseInfo;
    }
}
