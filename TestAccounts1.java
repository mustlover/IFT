// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: TestAccounts1.java
// Date: 4/8/18
// The is the program that runs the Account1.java class.
// This program creates the number of accounts the user
// wishes and displays the information and tracks how many
// accounts were created.
//************************************************************
 import java.util.Scanner;

public class TestAccounts1
{
    public static void main(String[] args)
    {
        Account1 testAcct;

        Scanner scan = new Scanner(System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("+  WELCOME TO JAVA INTERNATIONAL BANK  +");
        System.out.println("+--------------------------------------+");

        System.out.println("\nYou are a bank specialist who is in charge of creating new accounts.");

        System.out.println("\nHow many accounts would you like to create?");
        int num = scan.nextInt();

        for (int i=1; i<=num; i++)
        {
            testAcct = new Account1(100, "Name " + i);
            System.out.println("\nNew Account Information\n" + testAcct);
            System.out.println("\nYou created " + Account1.getNumAccounts() + " account(s).");
        }

        System.out.println("\n---END PROGRAM--");
    }
}

/* ----------------PROGRAM OUTPUT----------------

+--------------------------------------+
+  WELCOME TO JAVA INTERNATIONAL BANK  +
+--------------------------------------+

You are a bank specialist who is in charge of creating new accounts.

How many accounts would you like to create?
 4

New Account Information
Name: Name 1
Account Number: 5833
Balance: $100.00

You created 1 account(s).

New Account Information
Name: Name 2
Account Number: 3259
Balance: $100.00

You created 2 account(s).

New Account Information
Name: Name 3
Account Number: 2375
Balance: $100.00

You created 3 account(s).

New Account Information
Name: Name 4
Account Number: 5901
Balance: $100.00

You created 4 account(s).

---END PROGRAM--

 */