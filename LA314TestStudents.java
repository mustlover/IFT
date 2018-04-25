//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program to run LA314Students
//Date: 4/1/18
//******************************************

import java.util.*;

public class LA314TestStudents {

    public static void main(String[] args) {

        System.out.println("Your school has open enrollment. Please enroll a student.");
        //create a new student object
        LA314Students firstStudent;
        firstStudent = new LA314Students();

        //get information from user and set field values
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a students name: ");
        String name = scan.nextLine();
        firstStudent.setName(name);

        System.out.println("Enter the students age: ");
        int age = scan.nextInt();
        scan.nextLine();
        firstStudent.setAge(age);

        System.out.println("Enter the students major: ");
        String major = scan.nextLine();
        firstStudent.setMajorIT(major);

        System.out.println("Enter the students gender: ");
        char gender = scan.nextLine().charAt(0);
        firstStudent.setGender(gender);

        //Display information on the first and second student
        System.out.println("\nCurrent Enrollment Information:");
        System.out.println("--------------------------------");
        //Tells user how many students are enrolled
        System.out.println("There is currently " + LA314Students.getEnrolledStudents() + " student enrolled.");
        System.out.println(firstStudent.displayInfo());
        System.out.println("--------------------------------");

        System.out.println("\nA new student named Jane Doe has enrolled.");
        //create a new Student object using default values
        LA314Students secondStudent;
        secondStudent = new LA314Students("Jane Doe", 20, "CSE", 'F');

        //Display information on the first and second student
        System.out.println("\nCurrent Enrollment Information:");
        System.out.println("--------------------------------");
        //Tells user how many students are enrolled
        System.out.println("There are currently " + LA314Students.getEnrolledStudents() + " students enrolled.");
        System.out.println(firstStudent.displayInfo());
        System.out.println(secondStudent.displayInfo());
        System.out.println("--------------------------------");

        //change the second students major to IT
        System.out.println("\nJane Doe changed her major from CSE to IT");
        secondStudent.changeMajor("IT");

        //Display information on the first and second student after major change
        System.out.println("\nCurrent Enrollment Information:");
        System.out.println("--------------------------------");
        //Tells user how many students are enrolled
        System.out.println("There are currently " + LA314Students.getEnrolledStudents() + " students enrolled.");
        System.out.println(firstStudent.displayInfo());
        System.out.println(secondStudent.displayInfo());
        System.out.println("--------------------------------");

        System.out.println("\nA new student would like to enroll. Please enter their information.");
        //create a new Student object using user input
        LA314Students thirdStudent;
        thirdStudent = new LA314Students();

        System.out.println("Enter a students name: ");
        String name1 = scan.nextLine();
        thirdStudent.setName(name1);

        System.out.println("Enter the students age: ");
        int age1 = scan.nextInt();
        scan.nextLine();
        thirdStudent.setAge(age1);

        System.out.println("Enter the students major: ");
        String major1 = scan.nextLine();
        thirdStudent.setMajorIT(major1);

        System.out.println("Enter the students gender: ");
        char gender1 = scan.nextLine().charAt(0);
        thirdStudent.setGender(gender1);

        System.out.println("\nCurrent Enrollment Information:");
        System.out.println("--------------------------------");
        //Tells user how many students are enrolled
        System.out.println("There are currently " + LA314Students.getEnrolledStudents() + " students enrolled.");
        System.out.println(firstStudent.displayInfo());
        System.out.println(secondStudent.displayInfo());
        System.out.println(thirdStudent.displayInfo());
        System.out.println("--------------------------------");

        System.out.println("\n-----END PROGRAM------");
    }
}

/* --------------------PROGRAM OUTPUT--------------------

Your school has open enrollment. Please enroll a student.
Enter a students name:
John Doe
Enter the students age:
23
Enter the students major:
IT
Enter the students gender:
M

Current Enrollment Information:
--------------------------------
There is currently 1 student enrolled.
Students Name: John Doe	Age: 23	Gender: M	Major: true
--------------------------------

A new student named Jane Doe has enrolled.

Current Enrollment Information:
--------------------------------
There are currently 2 students enrolled.
Students Name: John Doe	Age: 23	Gender: M	Major: true
Students Name: Jane Doe	Age: 20	Gender: F	Major: false
--------------------------------

Jane Doe changed her major from CSE to IT

Current Enrollment Information:
--------------------------------
There are currently 2 students enrolled.
Students Name: John Doe	Age: 23	Gender: M	Major: true
Students Name: Jane Doe	Age: 20	Gender: F	Major: true
--------------------------------

A new student would like to enroll. Please enter their information.
Enter a students name:
Stan Lee
Enter the students age:
25
Enter the students major:
CSE
Enter the students gender:
M

Current Enrollment Information:
--------------------------------
There are currently 3 students enrolled.
Students Name: John Doe	Age: 23	Gender: M	Major: true
Students Name: Jane Doe	Age: 20	Gender: F	Major: true
Students Name: Stan Lee	Age: 25	Gender: M	Major: false
--------------------------------

-----END PROGRAM------

 */