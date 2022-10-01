/******************************************************
        Name: Pratik Narendra Gupta
        Student ID: 251211859
        Date: 14th February
        Task: Creating a class based on UML diagram.
*********************************************************/
        
package pgupta85_Lab4.src.Q3;

public class Student {
    //Creating private field according to UML diagram to store data.
    private int studentNumeber;
    private int yearOfBirth;
    private String firstName;
    private String lastName;
    private String emailAddress;

    //Creating a constructor with no args but when called it will initialized the private field with values.
    public Student (){
        studentNumeber = 251211859;
        yearOfBirth = 1998;
        firstName = "Pratik";
        lastName = "Gupta";
        emailAddress = "pgupta85@uwo.ca";
    }
    //Decaring another overloaded constructor with parameters.
    public Student (int sn, String fName, String lName){
        studentNumeber = sn;
        yearOfBirth = 0;
        firstName = fName;
        lastName = lName;
        emailAddress = " ";
    }
    
    //Creating Getter method called getStudentNumber with return type set to int. When called it will return student number.
    public int getStudentNumeber() {
        return studentNumeber;
    }
    
    //Creating Getter method called getName with return type set to string. When called it will add first and last name and return the full name.
    public String getName(){
        return (firstName+" "+lastName);
    }
    
    //Creating Getter method called getEmailAddress with return type set to String. When called it will return the email address.
    public String getEmailAddress() {
        return emailAddress;
    }

    //Creating Getter method called getAge with return type set to int. When called it will calculate the Age and return the value.
    public int getAge() {
        return (2022-yearOfBirth);
    }
}
