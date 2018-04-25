// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: Student.java
// Date: 4/1/18
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************


import java.util.Scanner;

public class Student
{
    //declare instance data
    private int score1, score2;
    private String name;
    private double average;
    private char grade;

    // ---------------------------------------------
    //constructor
    // ---------------------------------------------


    public Student(String studentName)
    {
    //add body of constructor
        name = studentName;
    }

    // ---------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 & test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    // ---------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter " + name + "'s first test score: ");
        score1 = scan.nextInt();
        System.out.println("Please enter " + name + "'s second test score: ");
        score2 = scan.nextInt();
    }

    // ---------------------------------------------
    //getAverage: compute and return the student's test average
    // ---------------------------------------------
    //add header for getAverage
    public double getAverage()
    {
    //add body of getAverage
        return average = (score1 + score2) / 2;
    }

    // ---------------------------------------------
    //getName: print the student's name
    // ---------------------------------------------
    //add header for printName
    public String getName()
    {
    //add body of printName
        return name;
    }

    public char getGrade()
    {
        //add body of Grade
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else grade = 'F';

        return grade;
    }

    // add to string method
    public String toString() {
        return "Students Name: " + name + "\t\t" + "Test 1: " + score1 + "\t" + "Test 2: "
                + score2 + "\t" + "Average: " + average + "\t" + "Grade: " + grade;
    }
}
