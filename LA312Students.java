//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Class for program LA312TestStudents to run
//Date: 4/1/18
//******************************************

public class LA312Students {

    //attributes
    private String name;
    private int age;
    private char gender;
    private boolean majorIT;

    //constructor
    public LA312Students()
    {
        name = "unknown"; //instead of "";
        age = 0;
        majorIT = false;
        gender = 'U'; //instead of '\u0000';
    }

    public LA312Students(String newName, int newAge, String major, char gender)
    {
        this.setName(newName);
        this.setAge(newAge);
        this.setMajorIT(major);
        this.setGender(gender);
    }

    //behaviors
    //method getAge()
    //computes the students age, the year of birth and the current year
    public int computeAge(int birthYear, int currentYear)
    {
        int age = currentYear - birthYear;
        return age;
    }

    //method changeMajor()
    public void changeMajor(String newMajor)
    {
        if(newMajor.equalsIgnoreCase("IT"))
        {
            majorIT = true;
        }
        else
        {
            majorIT = false;
        }
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean getMajorIT() {
        return majorIT;
    }

    public void setMajorIT(String major) {
        if(major.equalsIgnoreCase("IT"))
        {
            majorIT = true;
        }
        else
        {
            majorIT = false;
        }
    }
}
