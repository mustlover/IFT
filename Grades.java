// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: Grades.java
// Date: 4/1/18
// Use Student class to get test grades for two students
// and compute averages
// ************************************************************


public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");

        //create student2, "Mike"
        Student student2 = new Student("Mike");

        //input grades for Mary
        student1.inputGrades();

        //print average for Mary
        System.out.println(student1.getName() + "'s average test grade is: " + student1.getAverage() + "\n");

        //input grades for Mike
        student2.inputGrades();

        //print average for Mike
        System.out.println(student2.getName() + "'s average test grade is: " + student2.getAverage());

        System.out.println("\n-------------------------Student Date Information------------------------");
        student1.getGrade();
        System.out.println(student1);

        student2.getGrade();
        System.out.println(student2);


        System.out.println("\n-----End Program-----");
    }
}

/* -------------------------------PROGRAM OUTPUT-------------------------------

*****Note: I wanted to see if I could add in a letter grade for my own practice!*****

Please enter Mary's first test score:
95
Please enter Mary's second test score:
86
Mary's average test grade is: 90.0

Please enter Mike's first test score:
75
Please enter Mike's second test score:
95
Mike's average test grade is: 85.0

-------------------------Student Date Information------------------------
Students Name: Mary		Test 1: 95	Test 2: 86	Average: 90.0	Grade: A
Students Name: Mike		Test 1: 75	Test 2: 95	Average: 85.0	Grade: B

-----End Program-----
 */