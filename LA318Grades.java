//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Prompts user to enter in number of students
//and grades for each. then calculates which
//grade is highest and assigns a grade
//based on highest -10 A, -20 B, -30 C, -40 D
// and F if otherwise.
//Date: 4/1/18
//******************************************


import java.util.*;

public class LA318Grades {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");
        int numberStudents = scan.nextInt();
        int[] score = new int[numberStudents];

        int bestScore = 0;

        System.out.println("Enter " + numberStudents + " scores: ");

        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();
            if (bestScore < score[i]) {
                bestScore = score[i];
            }
        }

        char grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= bestScore - 10)
                grade = 'A';
            else if (score[i] >= bestScore - 20)
                grade = 'B';
            else if (score[i] >= bestScore - 30)
                grade = 'C';
            else if (score[i] >= bestScore - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);


        }
        System.out.println("\n-----END PROGRAM-----");
    }
}

/* --------------PROGRAM OUTPUT--------------

Please enter the number of students: 6
Enter 6 scores:
96
45
85
75
88
97
Student 0 score is 96 and grade is A
Student 1 score is 45 and grade is F
Student 2 score is 85 and grade is B
Student 3 score is 75 and grade is C
Student 4 score is 88 and grade is A
Student 5 score is 97 and grade is A

-----END PROGRAM-----

 */