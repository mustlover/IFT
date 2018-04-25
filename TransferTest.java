// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: TransferTest.java
// Date: 4/8/18
// The is the program that runs the Account1.java class. Transfers
// monies from one account to another account.
// ************************************************************

import java.util.Scanner;
public class TransferTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("+  WELCOME TO JAVA INTERNATIONAL BANK  +");
        System.out.println("+--------------------------------------+");

        System.out.println("\nCongratulations, you opened a checking and a savings account.\n");

        Account1 acct1, acct2;
        acct1 = new Account1(1000, "Checking");
        acct2 = new Account1(2000, "Savings");
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println(acct1);
        System.out.println("\n" + acct2);

        int option = 0;
        double amount = 0.0;
        while(option !=3)
        {
            System.out.println("\n\nTo make a transfer, please choose from the following options:");
            System.out.println("----------------------------------------------------------------");
            System.out.println("To transfer funds from checking to savings, please enter 1.");
            System.out.println("To transfer funds from savings to checking, please enter 2.");
            System.out.println("To quit, please enter 3.");
            System.out.println("----------------------------------------------------------------");
            option = scan.nextInt();
            if(option == 1)
            {
                System.out.print("\nHow much do you wish to transfer? ");
                amount = scan.nextDouble();
                Account1.transfer(acct1, acct2, amount);
                System.out.println("\nUpdated Account Status");
                System.out.println("=======================");
                System.out.println(acct1.toString() + "\n\n" + acct2.toString());
            }
            if(option == 2)
            {
                System.out.print("\nHow much do you wish to transfer? ");
                amount = scan.nextDouble();
                Account1.transfer(acct2, acct1, amount);
                System.out.println("\nUpdated Account Status");
                System.out.println("=======================");
                System.out.println("\n" + acct1.toString() + "\n\n" + acct2.toString());
            }
        }
        System.out.println("\nThank you for using Java International Bank. Please come again soon!");
        System.out.println("\n---END PROGRAM---");
    }
}


/* -------------------PROGRAM OUTPUT-------------------

+--------------------------------------+
+  WELCOME TO JAVA INTERNATIONAL BANK  +
+--------------------------------------+

Congratulations, you opened a checking and a savings account.

Account Details
===============
Name: Checking
Account Number: 3056
Balance: $1,000.00

Name: Savings
Account Number: 2045
Balance: $2,000.00


To make a transfer, please choose from the following options:
----------------------------------------------------------------
To transfer funds from checking to savings, please enter 1.
To transfer funds from savings to checking, please enter 2.
To quit, please enter 3.
----------------------------------------------------------------
1

How much do you wish to transfer? 2000
****WARNING**** Transfer Not Completed. Your account has insufficient funds.

Updated Account Status
=======================
Name: Checking
Account Number: 3056
Balance: $1,000.00

Name: Savings
Account Number: 2045
Balance: $2,000.00


To make a transfer, please choose from the following options:
----------------------------------------------------------------
To transfer funds from checking to savings, please enter 1.
To transfer funds from savings to checking, please enter 2.
To quit, please enter 3.
----------------------------------------------------------------
1

How much do you wish to transfer? 500

$500.00  was transferred FROM Checking TO Savings

Updated Account Status
=======================
Name: Checking
Account Number: 3056
Balance: $500.00

Name: Savings
Account Number: 2045
Balance: $2,500.00


To make a transfer, please choose from the following options:
----------------------------------------------------------------
To transfer funds from checking to savings, please enter 1.
To transfer funds from savings to checking, please enter 2.
To quit, please enter 3.
----------------------------------------------------------------
2

How much do you wish to transfer? 2000

$2,000.00  was transferred FROM Savings TO Checking

Updated Account Status
=======================

Name: Checking
Account Number: 3056
Balance: $2,500.00

Name: Savings
Account Number: 2045
Balance: $500.00


To make a transfer, please choose from the following options:
----------------------------------------------------------------
To transfer funds from checking to savings, please enter 1.
To transfer funds from savings to checking, please enter 2.
To quit, please enter 3.
----------------------------------------------------------------
2

How much do you wish to transfer? 1000
****WARNING**** Transfer Not Completed. Your account has insufficient funds.

Updated Account Status
=======================

Name: Checking
Account Number: 3056
Balance: $2,500.00

Name: Savings
Account Number: 2045
Balance: $500.00


To make a transfer, please choose from the following options:
----------------------------------------------------------------
To transfer funds from checking to savings, please enter 1.
To transfer funds from savings to checking, please enter 2.
To quit, please enter 3.
----------------------------------------------------------------
3

Thank you for using Java International Bank. Please come again soon!

---END PROGRAM---

 */

