//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program that creates a number from 1 to 100
//and prompts the user to guess and keep
//guessing until the number is correct
//indicating if they are too hi or too low
//Date: 4/1/18
//******************************************

import java.util.*;


public class LA316Guessing {

    public static void main(String[] args) {

        System.out.println("Lets Play The Guessing Game!");
        System.out.println("I'll pick a number from 1 to 100 and you guess what it is.");
        System.out.println("Ok?... Ready?....");

        Scanner scan = new Scanner(System.in);

        final int MAX = 100;
        int answer, guess;
        String again;

        Random generator = new Random();

        answer = generator.nextInt(MAX) + 1;

        do {
            System.out.println("ok I've picked a number.");
            System.out.println("What is your guess?: ");
            guess = scan.nextInt();

            while (guess != answer) {
                if (guess > answer) {
                    System.out.println("Your guess is too high");
                } else {
                    System.out.println("Your guess is too low");
                }
                System.out.println("Guess again! ");
                guess = scan.nextInt();
            }
            System.out.println("Great guess.. you win!");
            System.out.println("Would you like to play again?");
            again = scan.next();

        }while(again.equalsIgnoreCase("y"));
        System.out.println("Thank you, end program!");
    }
}

/* ---------------PROGRAM OUTPUT---------------

Lets Play The Guessing Game!
I'll pick a number from 1 to 100 and you guess what it is.
Ok?... Ready?....
ok I've picked a number.
What is your guess?:
50
Your guess is too high
Guess again!
40
Your guess is too low
Guess again!
45
Your guess is too high
Guess again!
44
Your guess is too high
Guess again!
43
Your guess is too high
Guess again!
42
Your guess is too high
Guess again!
41
Great guess.. you win!
Would you like to play again?
y
ok I've picked a number.
What is your guess?:
20
Your guess is too low
Guess again!
50
Your guess is too high
Guess again!
30
Your guess is too low
Guess again!
40
Your guess is too low
Guess again!
48
Your guess is too high
Guess again!
45
Your guess is too high
Guess again!
42
Your guess is too high
Guess again!
41
Great guess.. you win!
Would you like to play again?
n
Thank you, end program!
 */
