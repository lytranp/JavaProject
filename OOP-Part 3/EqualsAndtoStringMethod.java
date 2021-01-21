import java.util.Scanner;

public class EqualsAndtoStringMethod 
{
    private String month; 
    private int day; 
    private int year; 

    public void setDate(int newDay, String newMonth, int newYear)
    {
        day = newDay;
        year = newYear;
        month = newMonth;
    }

    public String toString() 
    {
        return (month + " " + day + " " + year);
    }

    public void writeOutput()
    {
        System.out.println(month + " " + day + " " + year);   
    }

    // equals Method
    public boolean equals(EqualsAndtoStringMethod otherObject)
    {
        return (month.equals(otherObject.month) 
        && (day == otherObject.day) && (year == otherObject.year));
    }    

    public String getMonth()
    {
        return month;
    }

    public boolean precedes(EqualsAndtoStringMethod otherObject) 
    {
        return (year >= otherObject.year)
                && (year != otherObject.year || !getMonth().equalsIgnoreCase(otherObject.getMonth()));
    }

    public static void main(String[] args) 
    {
        EqualsAndtoStringMethod d1 = new EqualsAndtoStringMethod();
        EqualsAndtoStringMethod d2 = new EqualsAndtoStringMethod();

        d1.setDate(6, "january", 17);
        d2.setDate(6, "january", 17);

        if (d1.equals(d2))
            System.out.println("d1 equals d2");
        
        System.out.println("d1 precedes d2 ?: " + d1.precedes(d2));

        System.out.println(d1.toString());

        d1.writeOutput();
        d1.toString();
    }
}
