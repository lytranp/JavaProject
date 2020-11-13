/*Employee	is	paid	for	each hour worked at	a rate of payrate.	
 * unpaid Hours are number	of	hours	for	which	payment	is	due	*/
package myOOP;
import java.text.DecimalFormat;

public class PayEmployees {
	
	private String name;
	private double payrate; //hourly pay rate
	private double unpaidHours;
	private BankAccount dda; //direct deposit account
	
	//static variables and constants
	private static DecimalFormat df;
	private final static double MINWAGE = 12.5;
	
	//3-arg constructor
	public PayEmployees(String name, double rate, BankAccount acct) {
		this.name = name.toUpperCase();
		this.setPayrate(rate);
		this.dda = acct;
	}
	
	//2-args constructor
	public PayEmployees (String name, double rate) {
		//this.name = name.toUpperCase();
		//this.setPayrate(hourlyRate);
		this(name, rate, null);
	}
		
	
	//accessor methods - getters return instance variable defined in class
	public String getName() {
		return this.name;
	}
	public double getPayrate() {
		return this.payrate;
	}
	public double getUnpaidHours() {
		return this.unpaidHours;
	}
	public BankAccount getDda() {
		return this.dda;
	}
	
	public void setDda(BankAccount acct) {
		this.dda = acct;
	}
	
	public void setPayrate(double rate) {
		if (rate >= PayEmployees.MINWAGE) //PayEmployees is optional
			this.payrate = rate;
		else {
			this.payrate = MINWAGE;
			System.out.println("Pay rate for " + this.name + "sets to minimum level");
		}
	}
	
	/*giveRaise increases the pay rate by the amount of the paramater value,
	which represents the raise as a decimal value (i.e 0.05 = 5%).
	If the paramater value is not positive, pay rate left unchanged.
	Return boolean indicating if raise was given.
	*/
	public boolean giveRaise(double raise) {
		boolean gotRaise = false;
		if(raise > 0) {
			this.payrate *= (1+raise);
			gotRaise = true;
		}
		return gotRaise;
	}
	
	public void addUnpaidHours(double hours) {
		this.unpaidHours += hours;
	}
	
	public void pay() {
		if(this.dda == null) {
			System.out.println("Cut a check to " + getName().toUpperCase()+
					"for " + df.format(this.payrate * this.unpaidHours));
			this.unpaidHours = 0;
		} else {
			dda.deposit(this.payrate * this.unpaidHours);
			System.out.println("Payment of " + df.format(this.payrate * this.unpaidHours) + 
					" to the account of " + getName().toUpperCase());
			this.unpaidHours = 0;
		}
	}
	
	//toString method: return description of an instance of class
	public String toString() {
		df = new DecimalFormat("$##,###.00");
		return this.name + " has payrate is :" + df.format(this.payrate);
	}

	

}
