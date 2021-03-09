/* This is an example of overloading */

import java.util.Scanner;

public class Date5 
{
    private String month;
    private int day;
    private int year; 

    // There are 5 constructors with same name as name of class -> must overloading 

    public Date5() // No-argument constructor
    {
        month = "january";
        day = 1;
        year = 2000;
    }
    
    public Date5(int monthInt, int day, int year) 
    {
        setDate(monthInt, day, year); // invoke another method inside a constructor 
    }

    public Date5(String monthStr, int day, int year) 
    {
        setDate(monthStr, day, year);
    }

    public Date5(int year)  
    {
        setDate(1,1,year); // Constructor often initialize all instance variables, even if there is not a corresponding parameter
    }

    public Date5(Date5 otherDate5)
    {
        if (otherDate5 == null) // not a real date 
        {
            System.out.println("Error");
            System.exit(0);
        }
        month = otherDate5.month;
        day = otherDate5.day;
        year = otherDate5.year;
    }

    // There are 2 overloads: setDate method
    public void setDate(int monthInt, int day, int year) 
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
        else 
        {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void setDate(String monthStr, int day, int year) 
    {
            this.month = monthStr;
            this.day = day;
            this.year = year;
    }

    public boolean dateOK (int monthInt, int day, int year)
    {
        return ((day >= 1 && day <= 31) &&
                (monthInt >= 1 && monthInt <= 12) &&
                (year >= 1000 && year <= 9999));
    }

    public String monthString (int month)
    {
        switch(month)
        {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            default:
                System.exit(0);
                return ("Error");
        }
    }

    public String toString()
    {
        return (month + " " + day + " " + year);
    }

    public static void main(String[] args) 
    { 
        Date5 date1 = new Date5();
        System.out.println("birthday is " + date1);

        Date5 date2 = new Date5(1, 29, 1934);
        System.out.println("birthday is " + date2);

        Date5 date3 = new Date5("March", 29, 1934);
        System.out.println("birthday is " + date3);

        Date5 date4 = new Date5(1987);
        System.out.println("birthday is " + date4);

        Date5 date5 = new Date5(date4);
        System.out.println("birthday is " + date5);
    }

}
