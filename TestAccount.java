// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: TestAccount.java
// Date: 4/8/18
// The is the program that runs the Account1.java class. This
// program tests overloading constructors and methods
// ************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;


public class TestAccount
{
    public static void main(String[] args)
    {
        String name;
        double balance;
        long acctNum;
        Account1 acct;

        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("$#, ##0.00");

        System.out.println("+--------------------------------------+");
        System.out.println("+  WELCOME TO JAVA INTERNATIONAL BANK  +");
        System.out.println("+--------------------------------------+");

        System.out.println("\nWelcome to Java International Bank. You are a bank" +
                "\nspecialist and are helping a client with their account." +
                "\nThe client is new and would like to open an new account.");

        System.out.println();

        System.out.print("\nPlease enter the account holder's first name: ");
        name = scan.next();
        acct = new Account1(name);
        System.out.println("\n An account for " + name + " has been setup.");
        System.out.println("------------------------------------------");
        System.out.println(acct);

        System.out.print("\nThe power went out and "  + name + "'s account was accidentally closed. " +
                "\nYou are authorized to open a new account under the same name. " +
                "\n\nPlease enter a starting balance: ");
        balance = scan.nextDouble();
        acct = new Account1(balance, name);
        System.out.println("\nA new account for " + name + " has been setup.");
        System.out.println("----------------------------------------------------");
        System.out.println(acct);

        System.out.print("\n****Error**** The account number assigned to " + name + "'s account is taken. " +
                "\n\nPlease assign a new account number: ");
        acctNum = scan.nextLong();
        acct = new Account1(balance, name, acctNum);
        System.out.println("\nAccount Details");
        System.out.println("----------------------------");
        System.out.println(acct);

        System.out.println("\nThe client was very satisfied with your service.");

        System.out.println("\nLater that week...");

        System.out.println("\n" + name + " walks in and deposits a $100 into the account.");
        System.out.print("The account balance is now: ");
        acct.deposit(100);
        System.out.println(fmt.format(acct.getBalance()));

        System.out.println("\nThe following day, " + name + " returns and withdraws $25 from the account.");
        System.out.print("The account balance is now: ");
        acct.withdraw(25);
        System.out.println(fmt.format(acct.getBalance()));
        System.out.println("\n" + name + " uses the ATM at the grocery store, withdrawing another $25." +
                "\nThe bank charges a $2 fee for non Java International Bank ATM withdrawls.");
        System.out.print("The account balance is now: ");
        acct.withdraw(25, 2);
        System.out.println(fmt.format(acct.getBalance()));

        System.out.println("\n---END PROGRAM---");
    }
}


/* --------------PROGRAM OUTPUT--------------

+--------------------------------------+
+  WELCOME TO JAVA INTERNATIONAL BANK  +
+--------------------------------------+

Welcome to Java International Bank. You are a bank
specialist and are helping a client with their account.
The client is new and would like to open an new account.


Please enter the account holder's first name: Suzy

 An account for Suzy has been setup.
------------------------------------------
Name: Suzy
Account Number: 6104
Balance: $0.00

The power went out and Suzy's account was accidentally closed.
You are authorized to open a new account under the same name.

Please enter a starting balance: 10000

A new account for Suzy has been setup.
----------------------------------------------------
Name: Suzy
Account Number: 6696
Balance: $10,000.00

****Error**** The account number assigned to Suzy's account is taken.

Please assign a new account number: 123456

Account Details
----------------------------
Name: Suzy
Account Number: 123456
Balance: $10,000.00

The client was very satisfied with your service.

Later that week...

Suzy walks in and deposits a $100 into the account.
The account balance is now: $10,100.00

The following day, Suzy returns and withdraws $25 from the account.
The account balance is now: $10,075.00

Suzy uses the ATM at the grocery store, withdrawing another $25.
The bank charges a $2 fee for non Java International Bank ATM withdrawls.
The account balance is now: $10,048.00

---END PROGRAM---

*/
