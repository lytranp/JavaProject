/**
 * This is an example of class invariant
 * Normally, a class definition should include a no-argument constructor. 
 * However, there are cases where a no-argument constructor makes little sense
 * For example, this class Person does not have a no-argument constructor for a reason:
 * A person may have no date of death, but a person always has date of birth. 
 * Although no-argument construtor can initialize all instance variables, but there is 
 * no suitable value to initialize the instance variable *born* unless it is provided 
 * as an argument to the constructor
 * Since we are assuming that an object of class Person always has a birth date, which is not null,
 * this is always true for every object of the class: called class invariant
 */
public class Person
{
    private String name;
    private Date born;
    private Date died; //null indicates still alive

    public Person(String initialName, Date birthDate, Date deathDate)
    {
        if (consistent(birthDate, deathDate))
        {
            name = initialName;
            born =  new Date5(birthDate) // Use class Date5 at the same package
            if (deathDate == null)
                died = null;
            else 
                died = new Date5(deathDate);
        }
        else 
        {
            System.out.println("Inconsistent");
            System.exit(0);
        }
    }

    public String toString()
    {
        String diedString;
        if (died == null)
            diedString = "";
        else
            diedString = died.toString() // This is toString method of class Date5 
        
        return (name + " , " + born + "-" + diedString);
    }

    public boolean equals(Person otherPerson)
    {
        if (otherPerson == null)
            return false;
        else
            return (name.equals(otherPerson.name)
                && born.equals(otherPerson.born)
                && datesMatch(died, otherPerson.died)
            )
    }

    // To match, diedDate1 and diedDate2 must either be the same date or must both be null
    private static boolean datesMatch(Date diedDate1, Date diedDate2)
    {
        if (diedDate1 == null) 
            return (diedDate2 == null);
        else if (diedDate1 != null && diedDate2 == null)
            return false;
        else 
            return(diedDate1.equals(diedDate2));
    }

    /*
    To be consistent, birthDate must not null. If still alive, deathDate == null.
    Otherwise, birthDate must come before or equal deathDate
    */
    private static boolean consistent(Date birthDate, Date deathDate)
    {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate)
                    || birthDate.equal(deathDate)
                    );
    }
}