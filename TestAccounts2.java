// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: TestAccounts2.java
// Date: 4/8/18
// The is the program that runs the Account1.java class. This
// program reads in 3 names, creates three separate accounts
// then closes one and attempts to consolidate the other two.
// ************************************************************


import javax.security.auth.login.AccountException;
import java.sql.SQLOutput;
import java.util.*;

public class TestAccounts2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = "";

        System.out.println("+--------------------------------------+");
        System.out.println("+  WELCOME TO JAVA INTERNATIONAL BANK  +");
        System.out.println("+--------------------------------------+");

        //Ask user for input and reads in
        System.out.print("\nPlease enter the name of the 1st account holder: ");
        name = scan.nextLine();
        Account1 acct1 = new Account1(100, name);
        System.out.print("Please enter the name of the 2nd account holder: ");
        name = scan.nextLine();
        Account1 acct2 = new Account1(100, name);
        System.out.print("Please enter the name of the 3rd account holder: ");
        name = scan.nextLine();
        Account1 acct3 = new Account1(100, name);

        //Create the new accounts and prints them out
        System.out.println("\nThe bank has created 3 new accounts");
        System.out.println("------------------------------------");
        System.out.println(acct1);
        System.out.println("\n" + acct2);
        System.out.println("\n" + acct3);

        //close account 1
        System.out.println("\nThe bank closed the following account(s): ");
        System.out.println("----------------------------------------");
        acct1.close();
        System.out.println(acct1);

        //attempt to consolidate remaining accounts 2 and 3
        System.out.println("\nThe bank will try to consolidate the remaining accounts.\n");

        System.out.println("\n\nAccounts for Consolidation");
        System.out.println("---------------------------");
        System.out.println(acct2);
        System.out.println("\n" + acct3);
        System.out.println("----------------------------\n");

        Account1 consolidated = Account1.consolidate(acct2, acct3);

        System.out.println("\nAccounts Consolidated");
        System.out.println("----------------------");
        System.out.println(consolidated);

        System.out.println("\n---END PROGRAM---");

    }

}

/*----------------PROGRAM OUTPUT----------------

OUTPUT 1

+--------------------------------------+
+  WELCOME TO JAVA INTERNATIONAL BANK  +
+--------------------------------------+

Please enter the name of the 1st account holder: Suzy
Please enter the name of the 2nd account holder: Mark
Please enter the name of the 3rd account holder: Rosie

The bank has created 3 new accounts
------------------------------------
Name: Suzy
Account Number: 1916
Balance: $100.00

Name: Mark
Account Number: 6946
Balance: $100.00

Name: Rosie
Account Number: 3549
Balance: $100.00

The bank closed the following account(s):
----------------------------------------
Name: Suzy -ACCOUNT CLOSED
Account Number: 1916
Balance: $0.00

The bank will try to consolidate the remaining accounts.



Accounts for Consolidation
---------------------------
Name: Mark
Account Number: 6946
Balance: $100.00

Name: Rosie
Account Number: 3549
Balance: $100.00
----------------------------

***Error*** Accounts must have the same name to be consolidated.

Accounts Consolidated
----------------------
null

---END PROGRAM---


OUTPUT 2

+--------------------------------------+
+  WELCOME TO JAVA INTERNATIONAL BANK  +
+--------------------------------------+

Please enter the name of the 1st account holder: Suzy
Please enter the name of the 2nd account holder: Rosie
Please enter the name of the 3rd account holder: Rosie

The bank has created 3 new accounts
------------------------------------
Name: Suzy
Account Number: 6213
Balance: $100.00

Name: Rosie
Account Number: 8228
Balance: $100.00

Name: Rosie
Account Number: 4130
Balance: $100.00

The bank closed the following account(s):
----------------------------------------
Name: Suzy -ACCOUNT CLOSED
Account Number: 6213
Balance: $0.00

The bank will try to consolidate the remaining accounts.



Accounts for Consolidation
---------------------------
Name: Rosie
Account Number: 8228
Balance: $100.00

Name: Rosie
Account Number: 4130
Balance: $100.00
----------------------------


Accounts Consolidated
----------------------
Name: Rosie
Account Number: 8389
Balance: $200.00

---END PROGRAM---


 */
