// ****************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab 6
// File: CountLetters.java
// Date: 4/22/18
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
// ****************************************************************
import java.util.Scanner;
public class CountLetters
{
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        //convert to all upper case
        word = word.toUpperCase();

        //count frequency of each letter in string
        try {
            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'A']++;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(word + " is not valid.");
        }
        //print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);

        System.out.println("\n---END PROGRAM---");
    }
}
