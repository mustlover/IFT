// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab2
// File: BandBooster.java
// Date: 4/1/18
// The is the class that BandSales.java program will run
// with methods for getting the names, updating the sales,
// and printing out total sales.
// ************************************************************


public class BandBooster {

    //declare instance data
    private int boxesSold;
    private String name;

    //constructor
    public BandBooster(String name, int boxesSold) {
        this.name = name;
        boxesSold = 0;
    }

    // method getName()
    // returns the name of the band booster student
    public String getName() {
        return name;
    }

    // method updateSales()
    // updates the amount of boxes sold each week and returns the final amount
    public int updateSales(int extra) {
        boxesSold = boxesSold + extra;
        return boxesSold;
    }

    // method toString()
    // returns the name of the band booster student,
    // and how many boxes they sold in three weeks
    public String toString() {
        return name + " sold a total of " + boxesSold + " boxes in 3 weeks.";
    }
}


