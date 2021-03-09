/* This is an example of overloading
Object of class represent pet records consisting of the pet's name, age and weight*/

import java.util.Scanner;

public class Pet 
{
    private String name;
    private int age;
    private double weight;

    public String toString()
    {
        return ("Name: " + name + " , " + " Age: " + age + " , " + "Weight: " + weight + " in pounds");
    }

    public Pet(String initialName, int initialAge, double initialWeight)
    {
        name = initialName;
        if (initialAge <= 0 || initialWeight <= 0)
        {
            System.out.println("Error"); 
            System.exit(0);
        }
        else 
        {
            age = initialAge;
            weight = initialWeight;
        }
    }

    // To change value of an existing object, we use mutator methods
    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if (newAge <= 0 || newWeight <= 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }

    // 2 next methods: constructor with name -> want to change name, using setName
    public Pet(String initialName)
    {
        name = initialName;
        age = 0; // Constructors normally set all instance variables, even if there is not full set of parameters
        weight = 0; 
    }

    public void setName(String newName)
    {
        name = newName;
    }
    
    // 2 next methods: constructor with age -> want to change age, using setAge
    public Pet(int initialAge) 
    {
        name = "No name yet";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            age = newAge;
    }

    // 2 next methods: constructor with weight -> want to change weight, using setWeight
    public Pet(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
            weight = newWeight;
    }

    public Pet()
    {
        name = "No name yet";
        age = 0;
        weight = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public static void main(String[] args) 
    {
        Pet pet1 = new Pet("xuki");
        System.out.println(pet1); // = System.out.println(pet1.toString())

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter pet's name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter pet's age: ");
        int age = keyboard.nextInt();
        System.out.println("Enter pet's weight: ");
        double weight = keyboard.nextDouble(); 
        
        pet1.set(name, age, weight);
        System.out.println(pet1.toString());
    }
}
