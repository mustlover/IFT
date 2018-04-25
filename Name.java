// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: Name.java
// Date: 4/1/18
// Class that will be run by the program TestNames.java
// with methods to get first middle and last names,
// arrange the names accordingly, and count the characters
// and length of the names
// ************************************************************


public class Name
{
    //declare instance data
    private String first, middle, last, other;

    //constructor
    public Name(String firstName, String middleName, String lastName) {
        first = firstName;
        middle = middleName;
        last = lastName;
    }
    //method getFirst()
    public String getFirst() {
        return first;
    }

    //method getMiddle()
    public String getMiddle() {
        return middle;
    }

    //method getLast()
    public String getLast() {
        return last;
    }

    // method firstMiddleLast()
    // arranges name by first middle last names
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    // method lastFirstMiddle()
    // arranges name by lsat, middle first names
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    //checks to see if the two strings are the same regardless of case
    public boolean equals(String otherName) {
        other = otherName;
        if(first.equalsIgnoreCase(other)) {
            return true;
        }
        else
            return false;
    }

    // method initials()
    // gets first letter of each name
    public String initials() {
        return (first.substring(0,1) + "." + middle.substring(0,1) + "." + last.substring(0,1) + ".");
    }

    // method length()
    // returns the total number of characters in the fill name no spaces included
    public int length() {
        return first.length() + middle.length() + last.length();
    }
}