// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird HW5
// File: Yorkshire.java
// Date: 4/15/18
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
// ************************************************************

public class Yorkshire extends Dog
{

    private static int breedWeight = 15;

    public Yorkshire(String name)
    {
        super(name);
    }

    // -------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // -------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }

    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
