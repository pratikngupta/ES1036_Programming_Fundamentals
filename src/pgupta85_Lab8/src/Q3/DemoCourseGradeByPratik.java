/**************************************************************
 Name: Pratik Narendra Gupta
 Student ID: 251211859
 Date: 8th April
 Task: Driver class for calculating the grades.
 ****************************************************************/

package pgupta85_Lab8.src.Q3;

import pgupta85_Lab8.src.Methods.MyMethod;

class DemoCourseGradeByPratik {
    public static void main(String[] args) {
        MyMethod.myHeader("Pratik Narendra Gupta", 8, 3);

        CourseAndInstructor es1036 = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB 361");
        StudentInfo s1 = new StudentInfo("Pratik Narendra", "Gupta", 251211859, es1036);

        System.out.println(s1.toString());
        System.out.println("===================\n\tScore Card\n===================");

        double[] labG = {15,15,15,15,15,15,15,15};
        GradeActivity avgLabG = new GradeActivity(labG,15);
        System.out.println("Lab Grade: "+avgLabG.toString());

        double[] quizG = {20,20,20,20,20};
        GradeActivity avgQuizG = new GradeActivity(quizG,20);
        System.out.println("Quiz Grade: "+avgQuizG.toString());

        GradeActivity midtermG = new GradeActivity(25,25);
        System.out.println("Midterm Grade: "+midtermG.toString());

        GradeActivity finalG = new GradeActivity(35,40);
        System.out.println("Final Grade: "+finalG.toString());

        System.out.println("=================================================");

        double[] finalScore = {avgLabG.getScore(), avgQuizG.getScore(), midtermG.getScore(), finalG.getScore()};
        GradeActivity courseG = new GradeActivity(finalScore,100);
        System.out.println("Course Grade: "+courseG.toString());

        System.out.println("=================================================");

        double[] bonusG = {5,5,5,4.4,5,5,5,5,5,5,5};
        GradeActivity avgBonusG = new GradeActivity(bonusG,5);
        System.out.println("Bonus Quiz Grade: "+avgBonusG.toString());

        GradeActivity reportedFinalG = new GradeActivity(avgBonusG.getScore()+ courseG.getScore(),100);
        System.out.println("Reported Final Grade (with bonus): "+reportedFinalG.toString());

        System.out.println("=================================================");

        MyMethod.myFooter("Pratik Narendra Gupta");
    }
}
