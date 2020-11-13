package myOOP;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Marry Smith", 10.0);
		Employee emp2 = new Employee("Joe Jones", 15.5);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println("Payrate for: " + emp1.getName() + ": " + emp1.getPayrate());

	}

}
