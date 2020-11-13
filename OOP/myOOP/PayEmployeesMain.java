package myOOP;

public class PayEmployeesMain {

	public static void main(String[] args) {
		PayEmployees emp1 = new PayEmployees("Ly Tran", 17.5);
		
		PayEmployees emp2 = new PayEmployees("Ha Nguyen", 12.5, new BankAccount(10000));
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	emp1.addUnpaidHours(5);
	emp1.addUnpaidHours(3);
	emp2.addUnpaidHours(12.5);
	
//	verify	if unpaid	hours	increased	correctly
	System.out.println("Unpaid hours: " + emp1.getName() + ": " + emp1.getUnpaidHours());
	System.out.println("Unpaid hours for " + emp2.getName() + ": " + emp2.getUnpaidHours());

	System.out.println(emp2.getDda());
	emp2.setDda(new BankAccount(50000));
	System.out.println(emp2.getDda());
	}

}
