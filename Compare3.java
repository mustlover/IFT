// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: Compare3.java
// Date: 4/8/18
// The is the class the program Comparisons.java will run. It
// uses the compareTo method comparing three string values
// and three integer values determining which is the largest.
// ************************************************************

public class Compare3 {

    public static Comparable largest(Comparable c1,Comparable c2,Comparable c3){

        //compareTo when strings, compare ASCII value to each letter... starting at the first letter and so on..
        //compareTo when numbers, compare numerical value... starting at the first number and so on..
        if (c1.compareTo(c2)> 0){
            if (c1.compareTo(c3)>0){
                return c1;
            } else {
                return c3;
            }
        } else if (c2.compareTo(c3)>0){
            return c2;
        } else {
            return c3;
        }
    }
}

