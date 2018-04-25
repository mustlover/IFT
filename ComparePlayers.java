// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: ComparePlayers.java
// Date: 4/15/18
// The is the program the runs the class Player.java.
// This program sets up to read in information inputted by the
// user about two baseball players and then compares them
// to see if they are equal or not
// ************************************************************

public class ComparePlayers
{

    public static void main(String[] args)
    {

        Player player1 = new Player();
        Player player2 = new Player();


        //Prompt for and read in information for player 1
        System.out.println("Please enter the following information about your 1st baseball player: ");
        player1.readPlayer();

        //Prompt for and read in information for player 2
        System.out.println("\nPlease enter the following information about your 2nd baseball player: ");
        player2.readPlayer();

        //Compare player 1 to player 2 and print a message saying whether they are equal
        System.out.println("\nI will now compare your two players, and tell you if they are equal or not.");
        System.out.println("COMPARING........ PLEASE WAIT........");

        if (player1.equals(player2)) {
            System.out.println("\nYour players are the same.");
        } else {
            System.out.println("\nYour players are different.");
        }

        System.out.println("\n---END PROGRAM---");
    }
}

/*------------------------------PROGRAM OUTPUT------------------------------

Please enter the following information about your 1st baseball player:
Name: Roger
Team: Padres
Jersey number: 11

Please enter the following information about your 2nd baseball player:
Name: Jaime
Team: BluJays
Jersey number: 34

I will now compare your two players, and tell you if they are equal or not.
COMPARING........ PLEASE WAIT........

Your players are different.

---END PROGRAM---

Please enter the following information about your 1st baseball player:
Name: Pete
Team: Dodgers
Jersey number: 33

Please enter the following information about your 2nd baseball player:
Name: Pete
Team: Dodgers
Jersey number: 33

I will now compare your two players, and tell you if they are equal or not.
COMPARING........ PLEASE WAIT........

Your players are the same.

---END PROGRAM---

 */
