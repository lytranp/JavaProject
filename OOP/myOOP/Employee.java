package myOOP;
import java.text.DecimalFormat;

public class Employee {

	private String employeeName;
	private Double payRate;
	
	private static DecimalFormat df;
	private final static double MINWAGE = 12.5;
	
	public Employee(String employeeName, Double payRate) {
		this.employeeName = employeeName.toUpperCase();
		this.payRate = payRate;
	}
	
	// accessor methods: 'getters' return the instance variables
	// defined for the class
	public String getName() {
		return this.employeeName;
	}
	
	public Double getPayrate() {
		return this.payRate;
	}
	
	/** toString method: returns description of an instance of the class */
	public String toString() {
		df = new DecimalFormat("$##,###.00");
		return "Employee's name is " + this.employeeName + " and payRate is " + df.format(this.payRate);
	}

}
