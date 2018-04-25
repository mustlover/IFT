//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Program that creates a current month calendar
// with current date starred
//Date: 4/1/18
//******************************************

import java.time.*;

public class LA319Calendar {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        int year = date.getYear();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int totalDaysInMonth = date.lengthOfMonth();

        LocalDate beginDay = LocalDate.of(year, month, 1);
        DayOfWeek beginDayOfWeek = beginDay.getDayOfWeek();

        System.out.printf("%7s%7s%7s%7s%7s%7s%7s%n", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun");

        int day = beginDayOfWeek.getValue();

        for (int i = 1; i < day; i++)
        {
            System.out.printf("%7s", "");
        }

        for (int i = 1; i <= totalDaysInMonth; i++)
        {
            if(i == dayOfMonth){
                System.out.printf("%7s", i + "*");
            }
            else{
                System.out.printf("%7s", i);
            }

            if(day == 7) {
                System.out.printf("%n");
                day = 0;
            }
            day++;
        }
        System.out.println("\n\n-----END PROGRAM-----");

    }
}

/* ---------------PROGRAM OUTPUT----------------

    Mon   Tues    Wed  Thurs    Fri    Sat    Sun
                           1      2      3      4
      5      6      7      8      9     10     11
     12     13     14     15     16     17     18
     19     20     21     22     23     24     25
     26     27     28     29    30*     31

-----END PROGRAM-----
 */
