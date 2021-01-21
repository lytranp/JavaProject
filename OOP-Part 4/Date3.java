import java.time.Year;
import java.util.Scanner;

public class Date3 
{
   private String month;
   private int day;
   private int year;

   public void writeOutput()
   {
       System.out.println(month + " " + day + " " + year);
   }

    public void readInput()
    {
        boolean tryAgain = false;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain)
        {
            System.out.println("Enter month, day, and year");
            int monthInput = keyboard.nextInt();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOK(monthInput, dayInput, yearInput))
            {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = true;
            }
            else 
                System.out.println("Illegal input");
        }
    }

    private boolean dateOK(int monthInput, int dayInput, int yearInput)
    {
        return
        ((monthInput >= 1) && (monthInput <= 12)&&
         (dayInput >= 1) && (dayInput <= 31) &&
         (yearInput >= 1000) && (yearInput <= 9999));
    }

    private void setDate(int monthInput, int dayInput, int yearInput)
    {
        month = monthString(monthInput);
        day = dayInput;
        year = yearInput;
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

    public void setMonth(int monthNumber)
    {
        if((monthNumber <=0) || (monthNumber > 12))
        {
            System.out.println("Error");
            System.exit(0);
        }
        else  
            month = monthString(monthNumber);
    }

    public void setDay(int dayNumber) 
    {
        if ((dayNumber < 1) || (dayNumber > 31))
        {
            System.out.println("Error");
            System.exit(0);
        }
        else  
            day = dayNumber;
    }

    public void setYear(int yearNumber) 
    {
        if ((yearNumber < 1000) || (yearNumber > 9999))
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            year = yearNumber;
    }

    public boolean equals(Date3 otherDate)
    {
        return ( (otherDate.day == day) 
        && (otherDate.month.equalsIgnoreCase(month)) 
        && (otherDate.year == year));
    }

    public String getMonth()
    {
        return month;
    }

    public boolean precedes(Date3 otherDate)
    {
        return ((year < otherDate.year)
            || (year == otherDate.year && month < otherDate.month())
            || (year == otherDate.year && month.equalsIgnoreCase(otherDate.month) && day < otherDate.day));
    }

    
}
