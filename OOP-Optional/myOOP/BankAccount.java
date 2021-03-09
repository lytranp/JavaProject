package myOOP;
import java.text.DecimalFormat;


public class BankAccount {
	// define instance variables at start of class
	private double balance; // defaults to 0.0
	
	// define a static method for use throughout all methods in class
	private static DecimalFormat df = new DecimalFormat("$##,###.00");
	
	// 1-arg constructor for setting the balance to tha value passed
	public BankAccount(double bal) {
		this.setBalance(bal);
	}

	// provide no-arg constructor that leaves balance unchanged
	public BankAccount() {
	}
	
	/**
	* provide public methods for accessing and mutating instance variables
	*/
	// accessor method for balance instance variable

	public double getBalance() {
		//here, 'this' is optional
		return this.balance;
	}
	
	// mutator method for balance instance variable
	public void setBalance(double balance) {
		// only allow balance to be set to a positive number
		if (balance > 0)
			// here, 'this' is required
			this.balance = balance;
	}
	
	// provide a toString method that returns a description of the BankAccount object
	public String toString() {
		return "Account balance is: " + df.format(this.balance);
	}
	
	public void withdraw(double amount) {
		if (amount <= 0)
			System.out.println("Invalid withdrawal amount");
		else if (amount > this.balance)
			System.out.println("Insufficient funds");
		else
			this.balance -= amount;
	}
	
	/**
	 * Define deposit method, which increases the balance by the amount passed as an
	 * argument as long as that amount is a positive number. Return a value of true
	 * if the deposit is successful or false otherwise
	 */
	public boolean deposit(double amount) {
		boolean success = false;
		if (amount > 0) {
			success = true;
			this.balance += amount;
		}
		return success;
	}
}
