//*************************************************************
//Assignment: Lab1 A
//File name: Problems.java
//Author: Suzy Kaufman
//Topic: Correcting Syntax Errors
//Description: program that prints several lines with lots
//              of syntax errors along the way
//*************************************************************


/*original program with errors

//*****************************************
//Problems.java
//
//Provides lots of syntax errors for the user to correct
//
********************************************


public class problems
{
    public Static main(string[] args)
    {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("This program used to have lots of problems,");
        System.out.println("but if it prints this, you fixed them all.")
        System.out.println("***Hurray!***");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }
}

*/

//fixed program with comments on what error were corrected

//*****************************************
//Problems.java  //(deleted following blank line, unnecessary)
//Provides lots of syntax errors for the user to correct //(deleted following blank line, unnecessary)
//***************************************** //added '//' to the beginning of this line



public class Problems // capitalized problems to match title
{
    //made Static static, added void between static and main, capitalized string
    public static void main(String[] args)
    {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("This program used to have lots of problems,");
        System.out.println("but if it prints this, you fixed them all."); //added ';' to the end of line
        System.out.println("***Hurray!***");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }
}