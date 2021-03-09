/* Prompt user input month, day, year. Then, using method to return values the user input*/
import java.util.Scanner; 

public class Date 
{
    private int day;
    private String month;
    private int year; 

    public void writeOutput()
    {
        System.out.println(month + " " + day + " " + year);
    }
    
    public void readInput()
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter month, day, and year");
        month = key.next().toLowerCase(); 
        day = key.nextInt();
        year = key.nextInt();      
    }

    public int getDay()
    {
        return day;
    }

    public int getYear() 
    {
        return year;
    }

    public int getMonth()
    {
        if (month.equals("january"))
            return 1;
        else if (month.equals("february"))
            return 2;
        else 
        {
            System.out.println("Error");
            System.exit(0);
            return 0;
        }
    }

    public static void main(String[] args) 
    {
        Date d = new Date();
        d.readInput();
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
