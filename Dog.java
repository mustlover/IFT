// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird HW5
// File: Dog.java
// Date: 4/15/18
// A class that holds a dog's name and can make it speak.
// ************************************************************

public abstract class Dog
{
    protected String name;
    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name)
    {
        this.name = name;
    }

    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()
    {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak()
    {
        return "Woof";
    }

    public abstract int avgBreedWeight();
}
