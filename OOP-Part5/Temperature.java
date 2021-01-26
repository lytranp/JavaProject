/* This is an example of static method and nonstatic method in the same class */

import java.util.Scanner; 

public class Temperature
{
    private double degrees;

    public Temperature()
    {
        degrees = 0;
    }

    public Temperature(double initialDegrees)
    {
        degrees = initialDegrees;
    }

    public void setDegrees(double newDegrees)
    {
        degrees = newDegrees;
    }

    public String toString()
    {
        return (degrees + "C");
    }

    public boolean equals(Temperature otherTemperature)
    {
        return(this.degrees == otherTemperature.degrees);
    }

    public static double toCelsius(double degreesF) 
    {
        return 5*(degreesF - 32)/9;
    }

    public static void main(String[] args) 
    {
        double degreesF, degreesC;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter degree F");
        degreesF = keyboard.nextDouble();
        degreesC = toCelsius(degreesF); // Because this method is in class Temperature, we do not need to put class name Temperature. It is equivalent to: Temperature.toCelsius

        // If we want to invoke other nonstatic methods, we have to create object first
        Temperature t1 = new Temperature(degreesC);
        Temperature t2 = new Temperature(20);

        System.out.println("2 temperatures are equal ?: " + t1.equals(t2));
    }

}