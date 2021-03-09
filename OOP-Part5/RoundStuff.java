/* This is an example of static method
Compute circles and spheres using static methods */

import java.util.Scanner;

public class RoundStuff 
{
    public static final double PI = 3.14159;

    public static double circleArea(double radius)
    {
        return (PI * radius * radius);
    }

    public static double sphereVolume(double r)
    {
        return ((4.0/3.0)*PI*r*r*r);
    }

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = keyboard.nextDouble();

        System.out.println("Area is: " + circleArea(r));

        double sVol = RoundStuff.sphereVolume(r);
        System.out.printf("Volume is: %,.2f", sVol);
    }
}
