import java.util.Scanner; 

public class Bill 
{ 
    public final double RATE = 150.00; //$ per quarter hour

    private int hours; 
    private int minutes; 
    private double fee; 

    public void inputTimeWorked() 
    {
        System.out.println("Enter number of full hours worked and followed by minutues: "); 
        Scanner object = new Scanner(System.in);
        hours = object.nextInt();
        minutes = object.nextInt();
    }

    // Use private method to use solely for next method
    private double computeFee(int hoursWorked, int minutesWorked)
    {
        minutesWorked = hoursWorked * 60 + minutesWorked;
        int quarterHours = minutesWorked / 15;
        return quarterHours * RATE;
    }

    public void updateFee()
    {
        fee = computeFee(hours, minutes);
    }

    public void outputBill()
    {
        System.out.printf("Amount due: $ %.1f", fee);
    }

    public static void main(String[] args) 
    {
        Bill b = new Bill();
        b.inputTimeWorked(); 
        b.updateFee();
        b.outputBill();
    }
}
