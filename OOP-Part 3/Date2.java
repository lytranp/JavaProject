import java.util.Scanner; 

public class Date2 
{ 
    private int day;
    private String month; 
    private int year;

    public void setDate(int newDay, int newMonth, int newYear)
    {
        day = newDay;
        year = newYear;
        month = monthString(newMonth);
    }

    public String monthString(int monthNumber) 
    {
        switch(monthNumber)
        {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            default:
                System.out.println("Out of range monthNumber");
                System.exit(0); 
                return "Error";
        }
    }

    public String getMonth()
    {
        return month;
    }

    /*
    public static void main(String[] args) 
    {
        Date2 object = new Date2();
        object.setDate(1, 2, 1987);
        System.out.println(object.getMonth());
    }
    */
}
