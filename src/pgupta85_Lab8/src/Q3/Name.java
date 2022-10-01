/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Return first name and last name
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

import pgupta85_Lab8.src.Methods.MyMethod;
public class Name {
    private String firstName;
    private String lastName;

    public Name() {}

    public Name(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName;
    }
}
