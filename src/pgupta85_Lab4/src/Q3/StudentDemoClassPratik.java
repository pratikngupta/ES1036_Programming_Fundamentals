/******************************************************
    Name: Pratik Narendra Gupta
    Student ID: 251211859
    Date: 14th February
    Task: Main driver class to display out student information.
*********************************************************/

package pgupta85_Lab4.src.Q3;

public class StudentDemoClassPratik {
    
    //Main Driver method
    public static void main(String[] args) {
        
        //Calling myHeader for introduction and passing args in brackets.
        myHeader("Pratik Narendra Gupta", 4,4);

        /*Creating Student type reference variable, here myInfo is used but it could be any name.
        As we created constructor in student class, It will assign my information to private fields.*/
        Student myInfo = new Student();
        System.out.println("Here is my information");
        System.out.println("======================");
        //Using printf to print out. %s is used for string while %d is use for integers.
        System.out.printf("I am %s", myInfo.getName()); //using myInfo.getName to get my name.
        System.out.printf("\nStudent number: %d", myInfo.getStudentNumeber()); //using myInfo.getStudentNumber to get my Student Number.
        System.out.printf("\nEmail Address; %s", myInfo.getEmailAddress()); //using myInfo.getEmailAddress to get my email address.
        System.out.printf("\nAge: %d\n", myInfo.getAge()); //using myInfo.getAge to get my age.

        //Assigning 3 more reference variable and passing respective arguments to the constructor.
        //Here constructor with parameter will be called, i.e Student(int,string,string)
        Student addieInfo = new Student(250211375, "Addie", "Slowgrave");
        Student taliaInfo = new Student(250309716, "Talia", "Hanscom");
        Student valeriaInfo = new Student(250136525, "Valeria", "McCloughen");

        System.out.println("\nHere is the info on other student");
        System.out.println("===============================");
        System.out.println("Number\t   Name");
        System.out.println("=========  ====================");
        //Using printf to print out. %s is used for string while %d is use for integers.
        System.out.printf("%d  %s\n",addieInfo.getStudentNumeber() ,addieInfo.getName()); //using addinfo as reference variable to get all other information from getter method.
        System.out.printf("%d  %s\n",taliaInfo.getStudentNumeber() ,taliaInfo.getName()); //using taliaInfo as reference variable to get all other information from getter method.
        System.out.printf("%d  %s\n",valeriaInfo.getStudentNumeber() ,valeriaInfo.getName()); //using valeraiInfo as reference variable to get all other information from getter method.
        System.out.println("==============================");

        //Calling myFooter for ending signature.
        myFooter("Pratik Narendra Gupta");

    }

    //creating a method call myHeader which will accept my name, lab number and question number than input when called.
    public static void myHeader(String fullName, int labNum, int quesNum ){
        System.out.println("******************************************************");
        System.out.println(fullName);
        System.out.printf("Lab %d, Question %d\n", labNum, quesNum);
        System.out.println("******************************************************");
    }

    //Creating a method called myFooter which accepts my name as input
    public static void myFooter(String fullName){
        System.out.printf("\n\n*** Signing off - %s ***", fullName);
    }
}
