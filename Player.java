// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab5
// File: Players.java
// Date: 4/15/18
// The is the class that the program ComparePlayer.java.
// runs.
// ************************************************************

import java.util.Scanner;

public class Player {
    private String name;
    private String team;
    private int jerseyNumber;

    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and 
    // jersey number.
    //-----------------------------------------------------------
    public void readPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    public boolean equals(Object p) {
        if (p instanceof Player) {
            if (this.team.equalsIgnoreCase(((Player)p).team)
                    && this.jerseyNumber == ((Player)p).jerseyNumber) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
