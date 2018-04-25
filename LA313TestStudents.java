//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program to run LA313Students
//Date: 4/1/18
//******************************************

import java.util.*;

public class LA313TestStudents {

    public static void main(String[] args) {


        //create Student object using default values
        LA313Students firstStudent;
        firstStudent = new LA313Students();

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

        //create Student object using default values
        LA313Students secondStudent;
        secondStudent = new LA313Students("Jane Doe", 20, "CSE", 'F');

        //Display information on the first and second student
        System.out.println("\n" + firstStudent.displayInfo());
        System.out.println(secondStudent.displayInfo());

        //change the second students major to IT
        System.out.println("\nJane Doe changed her major from CSE to IT");
        secondStudent.changeMajor("IT");

        //Display information on the first and second student after major change
        System.out.println("\n" + firstStudent.displayInfo());
        System.out.println(secondStudent.displayInfo());

        System.out.println("\n-----END PROGRAM------");
    }
}

/* --------------------PROGRAM OUTPUT--------------------
Enter a students name:
John Doe
Enter the students age:
32
Enter the students major:
IT
Enter the students gender:
M

Students Name: John Doe	Age: 32	Gender: M	Major: true
Students Name: Jane Doe	Age: 20	Gender: F	Major: false

Jane Doe changed her major from CSE to IT

Students Name: John Doe	Age: 32	Gender: M	Major: true
Students Name: Jane Doe	Age: 20	Gender: F	Major: true

-----END PROGRAM------
 */