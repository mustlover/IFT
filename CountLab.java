// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: Count.java
// Date: 3/25/18
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************


import java.util.Scanner;

public class CountLab
{

        public static void main (String[] args) {

            String phrase; // a string of characters
            // the number of blanks (spaces) in the phrase
            int countBlank, counta, counts, countt, counte;
            int length; // the length of the phrase
            char ch; // an individual character in the string

            String answer;

            Scanner scan = new Scanner(System.in);

            do{
                // Print a program header
                System.out.println();
                System.out.println("Character Counter");
                System.out.println();


                // Read in a string and find its length
                System.out.print("Enter a sentence or phrase: ");
                phrase = scan.nextLine();
                length = phrase.length();

                // Initialize counts
                countBlank = 0; counts = 0; counta = 0; countt = 0; counte = 0;

                //a for loop to go through the string character by character
                for (int i = 0; i < length; i++) {
                    ch = phrase.charAt(i);

                    //Switch statement for 9 different characters
                    switch (ch) {
                        case 'a':
                        case 'A':
                            counta++;
                            break;
                        case 't':
                        case 'T':
                            countt++;
                            break;
                        case 's':
                        case 'S':
                            counts++;
                            break;
                        case 'e':
                        case 'E':
                            counte++;
                            break;
                        case ' ':
                            countBlank++;
                            break;
                    }
                }

                // Print the results
                System.out.println();
                System.out.println("Number of blank spaces: " + countBlank);
                System.out.println("Number of a's: " + counta);
                System.out.println("Number of s's: " + counts);
                System.out.println("Number of t's: " + countt);
                System.out.println("Number of e's: " + counte);

                System.out.println("\nWould you like to do another phrase? ('y' to continue 'quit' to end)");
                answer = scan.nextLine();  //Make sure you do nextLine() not next()

            }while(answer.equalsIgnoreCase("y"));
            System.out.println("Thank you, end program!");
        }
}

/*
****************************************************PROGRAM OUTPUT*********************************************

Character Counter

Enter a sentence or phrase: Peter Piper picked a peck of pickled peppers

Number of blank spaces: 7
Number of a's: 1
Number of s's: 1
Number of t's: 1
Number of e's: 8

Would you like to do another phrase? ('y' to continue 'quit' to end)
y

Character Counter

Enter a sentence or phrase: Suzy sold seashells by the seashore

Number of blank spaces: 5
Number of a's: 2
Number of s's: 7
Number of t's: 1
Number of e's: 5

Would you like to do another phrase? ('y' to continue 'quit' to end)
y

Character Counter

Enter a sentence or phrase: How much wood could a woodchuck chuck if a woodchuck could chuck wood?

Number of blank spaces: 12
Number of a's: 2
Number of s's: 0
Number of t's: 0
Number of e's: 0

Would you like to do another phrase? ('y' to continue 'quit' to end)
quit
Thank you, end program!

Process finished with exit code 0
***************************************************************************************************************
 */
