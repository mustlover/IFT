// ************************************************************
// Name: Suzanne Kaufman
// Class: IFT 194 B - Bird Lab4
// File: ChangingPeople.java
// Date: 4/8/18
// The is the program that will run the class Person
// so that names will be changed, or assigned a object.
// ************************************************************

public class ChangingPeople
{
    // ---------------------------------------------------------
    // Sets up two person objects, one integer, and one String
    // object. These are sent to a method that should make
    // some changes.
    // ---------------------------------------------------------
    public static void main (String[] args)
    {
        //Original parameters 1 and 2
        Person person1 = new Person ("Sally", 13);
        Person person2 = new Person ("Sam", 15);
        int age = 21;
        String name = "Jill";
        System.out.println ("\nParameter Passing... Original values...");
        System.out.println ("person1: " + person1);
        System.out.println ("person2: " + person2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");

        //call the values after the changes below  have been made...
        changePeople (person1, person2, age, name);//send it to the method person1 is p1, person2 is p2
        System.out.println ("\nValues after calling changePeople...");
        System.out.println ("person1: " + person1);
        System.out.println ("person2: " + person2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");
    }

    // -------------------------------------------------------------------
    // Change the first actual parameter to "Jack - Age 101" and change
    // the second actual parameter to be a person with the age and
    // name given in the third and fourth parameters.
    // -------------------------------------------------------------------
    public static void changePeople (Person p1, Person p2, int age, String name)
    {
        System.out.println ("\nInside changePeople... Original parameters...");
        System.out.println ("person1: " + p1);
        System.out.println ("person2: " + p2);
        System.out.println ("age: " + age + "\tname: " + name + "\n");

        // Make changes

        Person p3 = new Person (name, age);//creates new person using Jill, 21
        // p2 = p3; //temporary inside this method!
        p2.changeName(name);
        p2.changeAge(age);
        name = "Jack";
        age = 101;
        p1.changeName (name); //changes p1 name to Jack
        p1.changeAge (age);  //changes p2 name to 101



        // Print changes
        System.out.println ("\nInside changePeople... Changed values...");
                System.out.println ("person1: " + p1);
                System.out.println ("person2: " + p2);
                System.out.println ("age: " + age + "\tname: " + name + "\n");
    }
}

/* ---------------PROGRAM OUTPUT---------------


    Parameter Passing... Original values...
    person1: Sally - Age 13
    person2: Sam - Age 15
    age: 21	name: Jill


    Inside changePeople... Original parameters...
    person1: Sally - Age 13
    person2: Sam - Age 15
    age: 21	name: Jill


    Inside changePeople... Changed values...
    person1: Jack - Age 101
    person2: Jill - Age 21
    age: 101	name: Jack


    Values after calling changePeople...
    person1: Jack - Age 101
    person2: Sam - Age 15
    age: 21	name: Jill

---------------------------------------------------
Change to make program work OUTPUT


Parameter Passing... Original values...
person1: Sally - Age 13
person2: Sam - Age 15
age: 21	name: Jill


Inside changePeople... Original parameters...
person1: Sally - Age 13
person2: Sam - Age 15
age: 21	name: Jill


Inside changePeople... Changed values...
person1: Jack - Age 101
person2: Jill - Age 21
age: 101	name: Jack


Values after calling changePeople...
person1: Jack - Age 101
person2: Jill - Age 21
age: 21	name: Jill

*/