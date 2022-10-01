/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Course instructors
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

public class CourseAndInstructor extends InstructorInfo{
    private String courseName;

    public CourseAndInstructor(){}

    public CourseAndInstructor(String cN,String fN,String lN,String oL){
        super(fN,lN,oL);
        courseName=cN;
    }

    @Override
    public String toString() {
        return "Course Name: "+courseName+"\n"+super.toString();
    }
}
