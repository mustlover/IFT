// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird HW5
// File: DogTest.java
// Date: 4/15/18
//  A simple test class that creates a Dog and makes it speak.
// ************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());

        Labrador labrador = new Labrador("Dylan", "yellow");
        System.out.println(labrador.getName() + " says " + labrador.speak());

        Yorkshire yorkshire = new Yorkshire("Chomp");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());

        System.out.println("The average breed weight of " + labrador.name + " is " + labrador.avgBreedWeight() + "lbs.");
        System.out.println("The average breed weight of " + yorkshire.name + " is " + yorkshire.avgBreedWeight() + "lbs.");

        System.out.println("\n---END PROGRAM---");

    }
}


/* ----------------PROGRAM OUTPUT----------------

Dylan says WOOF
Chomp says woof
The average breed weight of Dylan is 75lbs.
The average breed weight of Chomp is 15lbs.

---END PROGRAM---

 */
