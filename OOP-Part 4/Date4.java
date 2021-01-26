/* This is an example of overloading*/

import java.util.Scanner;

public class Date4 
{
    private String month;
    private int day; 
    private int year;

    // There are 2 overload methods: same name setDate; but different parameters

    public void setDate(int monthInt, int day, int year)
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
    }

    public void setDate(String month, int day, int year)
    {
        if (dateOK(month, day, year))
        {
            this.month = month;
            this.day = day;
            this.year = year;
        }
    }

    // There are 2 different methods named setDate
    public void setDate(int year)
    {
        setDate(1, 1, year);
    }

    // There are 2 overload methods: same name dateOK; but different parameters

    public boolean dateOK (int monthInt, int dayInt, int yearInt)
    {
        return ((monthInt >= 1 && monthInt <= 12) && 
            (dayInt >= 1 && dayInt <= 31) && 
            (yearInt >= 1000 && yearInt <= 9999));
    }

    public boolean dateOK (String monthStr, int day, int year)
    {
        return (monthOK(monthStr) && 
                (dayInt >= 1 && dayInt <= 31) &&
                (yearInt >= 1000 && yearInt <= 9999));
    }

    public boolean monthOK(String monthStr)
    {
        return (monthStr.equalsIgnoreCase("january") ||
                monthStr.equalsIgnoreCase("february") ||
                monthStr.equalsIgnoreCase("march"));
    }

    private String monthString(int monthInput)
    {
        switch(monthInput)
        {
            case 1: 
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                System.exit(0);
                return ("Error");
        }
    }

    public void readInput()
    {
        boolean set = false; 
        Scanner keyboard = new Scanner(System.in);
        while (set)
        {
            System.out.println("Enter month, day, year");
            String month = keyboard.next();
            int day = keyboard.nextInt();
            int year = keyboard.nextInt();
            if (dateOK(monthStr, day, year))
            {
                setDate(month, day, year);
                set = true;
            }
            else 
                System.out.println("Error type. Try again");
        }
    }
}
