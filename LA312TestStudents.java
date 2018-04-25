//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program to run LA312Students
//Date: 4/1/18
//******************************************

import java.util.*;

public class LA312TestStudents {

    public static void main(String[] args) {


        //create Student object using default values
        LA312Students firstStudent;
        firstStudent = new LA312Students();

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

        //Show the first students information
        System.out.println("\nInformation of the first student:");
        System.out.println("----------------------------------");
        System.out.println("\tName: " + firstStudent.getName());
        System.out.println("\tAge: " + firstStudent.getAge());
        System.out.println("\tIT Major?: " + firstStudent.getMajorIT());
        System.out.println("\tGender: " + firstStudent.getGender());
        System.out.println("\tCalculated Age: " + firstStudent.computeAge(1981, 2017));

        //create Student object using default values
        LA312Students secondStudent;
        secondStudent = new LA312Students("Jane Doe", 20, "CSE", 'F');

        //Show the second students information
        System.out.println("\nInformation of the second student:");
        System.out.println("----------------------------------");
        System.out.println("\tName: " + secondStudent.getName());
        System.out.println("\tAge: " + secondStudent.getAge());
        System.out.println("\tIT Major?: " + secondStudent.getMajorIT());
        System.out.println("\tGender: " + secondStudent.getGender());
        System.out.println("\tCalculated Age: " + secondStudent.computeAge(1981, 2017));

        //change the second students major to IT
        secondStudent.changeMajor("IT");

        //Show the second students information
        System.out.println("\nInformation of the second student after major change:");
        System.out.println("------------------------------------------------------");
        System.out.println("\tName: " + secondStudent.getName());
        System.out.println("\tAge: " + secondStudent.getAge());
        System.out.println("\tIT Major?: " + secondStudent.getMajorIT());
        System.out.println("\tGender: " + secondStudent.getGender());
        System.out.println("\tCalculated Age: " + secondStudent.computeAge(1981, 2017));

        System.out.println("\n-----END PROGRAM------");
    }
}


/* -------------------------------PROGRAM OUTPUT-------------------------------
Enter a students name:
Peter
Enter the students age:
34
Enter the students major:
IT
Enter the students gender:
M

Information of the first student:
----------------------------------
	Name: Peter
	Age: 34
	IT Major?: true
	Gender: M
	Calculated Age: 36

Information of the second student:
----------------------------------
	Name: Jane Doe
	Age: 20
	IT Major?: false
	Gender: F
	Calculated Age: 36

Information of the second student after major change:
------------------------------------------------------
	Name: Jane Doe
	Age: 20
	IT Major?: true
	Gender: F
	Calculated Age: 36

-----END PROGRAM------

 */