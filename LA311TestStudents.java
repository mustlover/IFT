//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program to run LA311Students
//Date: 4/1/18
//******************************************

import java.util.*;

public class LA311TestStudents {

    public static void main(String[] args) {


        //create Student object using default values
        LA311Students firstStudent;
        firstStudent = new LA311Students();
        firstStudent.setName("Peter");
        firstStudent.setAge(32);
        firstStudent.setMajorIT("IT");
        firstStudent.setGender('M');

        System.out.println("Information of the first student:\n");
        System.out.println("\tName: " + firstStudent.getName());
        System.out.println("\tAge: " + firstStudent.getAge());
        System.out.println("\tIT Major?: " + firstStudent.getMajorIT());
        System.out.println("\tGender: " + firstStudent.getGender());
        System.out.println("\tCalculated Age: " + firstStudent.computeAge(1981, 2017));

        System.out.println("\n-----END PROGRAM-----");

    }
}

/* ------------PROGRAM OUTPUT------------

Information of the first student:

	Name: Peter
	Age: 32
	IT Major?: true
	Gender: M
	Calculated Age: 36

-----END PROGRAM-----
 */
