//********************************************************************
//  Propagation.java       Author: Lewis/Loftus
//
//  Demonstrates exception propagation.
//********************************************************************

public class Propagation
{
    //-----------------------------------------------------------------
    //  Invokes the level1 method to begin the exception demonstration.
    //-----------------------------------------------------------------
    static public void main(String[] args)
    {
        ExceptionScope demo = new ExceptionScope();

        System.out.println("Program beginning.");
        demo.level1();
        System.out.println("Program ending.");
    }
}

/* ---------------------PROGRAM OUTPUT---------------------

Propagation
java.lang.ArithmeticException: / by zero
Program beginning.
Level 1 beginning.
Level 2 beginning.
Level 3 beginning.

The exception message is: / by zero

The call stack trace:

Level 1 ending.
Program ending.
	at ExceptionScope.level3(ExceptionScope.java:54)
	at ExceptionScope.level2(ExceptionScope.java:41)
	at ExceptionScope.level1(ExceptionScope.java:18)
	at Propagation.main(Propagation.java:17)

-------------------------------------------------------------------

HW 11.2 What would happen if the try statement were removed
from the level1 method of the Exception Scope class in the
Propagation program?

	Propagation
Program beginning.
Exception in thread "main" java.lang.ArithmeticException: / by zero
Level 1 beginning.
Level 2 beginning.
	at ExceptionScope.level3(ExceptionScope.java:54)
Level 3 beginning.
	at ExceptionScope.level2(ExceptionScope.java:41)
	at ExceptionScope.level1(ExceptionScope.java:18)
	at Propagation.main(Propagation.java:17)

--------------------------------------------------------------------

Ex. 11.3: What would happen if the try statement described in the
previous exercise were moved to the level2 method?

	Propagation
Program beginning.
Level 1 beginning.
Level 2 beginning.
Level 3 beginning.

java.lang.ArithmeticException: / by zero
The exception message is: / by zero

The call stack trace:
	at ExceptionScope.level3(ExceptionScope.java:68)

	at ExceptionScope.level2(ExceptionScope.java:43)
Level 2 ending.
	at ExceptionScope.level1(ExceptionScope.java:18)
Level 1 ending.
	at Propagation.main(Propagation.java:17)
Program ending.
 */