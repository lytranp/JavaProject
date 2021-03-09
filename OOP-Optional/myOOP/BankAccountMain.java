package myOOP;

public class BankAccountMain {

	public static void main(String[] args) {
		
		// create objects of class BankAccount 
		BankAccount wifeAccount = new BankAccount();
		BankAccount husbandAccount = new BankAccount();
		
		wifeAccount.setBalance(10000);
		husbandAccount.setBalance(-500.50);
		
		// use accessor methods to access private instance variable
		System.out.println(wifeAccount.getBalance());
		System.out.println(husbandAccount.getBalance());
		
		wifeAccount.withdraw(5000);
		wifeAccount.withdraw(-10.50);
		husbandAccount.withdraw(500);
		
		BankAccount account1 = new BankAccount(1000);
		account1.withdraw(-5);
		account1.withdraw(10);
		account1.setBalance(10000);
		account1.withdraw(100);
		System.out.println("account1 balance " + account1.deposit(50));
		System.out.println("Deposited worked is  " + account1.deposit(-50));
		System.out.println("account1 balance  " + account1.getBalance());

		System.out.println(wifeAccount);
	}

}
