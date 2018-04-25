// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: Account1.java
// Date: 4/8/18
// The is the class for programs TestAccount.java, TestAccounts1.java,
// TestAccounts2.java, and TransferTest.java. This class sets up to read in
// account holders, randomly generate account numbers, consolidate
// accounts, make transactions, and close accounts
// ************************************************************

import java.text.DecimalFormat;
import java.util.Random;

public class Account1 {
    private double balance;
    private String name;
    private long acctNum;
    private static Random rnd = new Random();
    private static int numAccounts;
    private

    DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
    // -------------------------------------------------
    // Constructor -- initializes balance, owner and generates a random account number
    // -------------------------------------------------
    public Account1(double initBal, String owner) {
        fmt.format(balance = initBal);
        name = owner;
        acctNum = rnd.nextInt(9000) + 1000; //1000 to 9999
        numAccounts++;
    }

    // -------------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    // -------------------------------------------------
    public Account1(double initBal, String owner, long number) {
        fmt.format(balance = initBal);
        name = owner;
        acctNum = number;
        numAccounts++;
    }

    // -------------------------------------------------
    // Constructor -- initializes owner, then sets balance to 0,
    // and generates a random account number
    // -------------------------------------------------
    public Account1(String owner) {
        fmt.format(balance = 0.0);
        name = owner;
        acctNum = rnd.nextInt(9000) + 1000; //1000 to 9999
        numAccounts++;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public long getAcctNum() {
        return acctNum;
    }

    // -------------------------------------------------
    // Returns balance.
    // -------------------------------------------------
    public double getBalance() {
        return balance;
    }

    // -------------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    // -------------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    // -------------------------------------------------
    // takes a fee and deducts that fee from the account.
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    // -------------------------------------------------
    public void withdraw(double amount, double fee) {

        if (balance >= amount + fee)
            balance = balance - amount - fee;
        else
            System.out.println("Insufficient funds");

    }

    // -------------------------------------------------
    // Adds deposit amount to balance.
    // -------------------------------------------------

    public void deposit(double amount) {
        balance += amount;
    }


    //-------------------------------------------------
    // Transfer money from one account to another
    // -------------------------------------------------
    //first function, transfers money from declared account to acct
    public void transfer(Account1 acct, double amount)
    {
        if(balance >= amount) //checks if there is enough money
        {
            acct.balance += amount;
            withdraw(amount);
            System.out.print("\n" + fmt.format(amount) + " was transferred FROM "
                    + name + " TO " + acct.name + "\n");
        }
        else
        {
            System.out.println("****WARNING**** Transfer Not Completed. Your account has insufficient funds.");
        }
    }

    //second function, transfers money from acct1 to acct2
    public static void transfer(Account1 acct1, Account1 acct2, double amount)
        {
        if(acct1.balance >= amount)
        {
            acct2.deposit(amount);
            acct1.withdraw(amount);
            DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
            System.out.print("\n" + fmt.format(amount) + " was transferred FROM "
                    + acct1.name + " TO " + acct2.name + "\n");
        }
        else
        {
            System.out.println("****WARNING**** Transfer Not Completed. Your account has insufficient funds.");
        }
    }

    // -------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    // -------------------------------------------------
    public String toString() {
        DecimalFormat fmt = new DecimalFormat("$#, ##0.00");
        return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: "
                + fmt.format(balance);
    }

    //-------------------------------------------------
    // closes accounts
    // -------------------------------------------------
    public static int getNumAccounts() {
        return numAccounts;
    }

    public void close() {
        name += " -ACCOUNT CLOSED";
        balance = 0.0;
        numAccounts--;
    }
    //-------------------------------------------------
    //  consolidates accounts
    // -------------------------------------------------
    public static Account1 consolidate(Account1 acct1, Account1 acct2) {

        if (!acct1.name.equalsIgnoreCase(acct2.name)) {
            System.out.println("***Error*** Accounts must have the same name to be consolidated.");
            return null;
        }

        if (acct1.acctNum == acct2.acctNum) {
            System.out.println("***Error*** Account numbers are the same. " +
                    "The same account cannot be consolidated into itself.");
            return null;
        }


        //create a new account with a randomly generated account number
        Account1 acctNew = new Account1(acct1.name);
        acctNew.balance = acct1.balance + acct2.balance;

        //close the two old accounts
        acct1.close();
        acct2.close();

        return acctNew;
    }
}