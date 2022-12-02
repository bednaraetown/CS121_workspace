/**
 * public class for the math operations in a bank account 
 * also contains options menu
 * @author august bednar
 *
 */
public class Account {

	//member vars
	private String username;
	private double balance = 0.0;
	
	//constructor
	public Account(String username) {
		this.username = username;
		
	}
	
	//getter for balance
	public double getBalance() {
		return balance;
	}
	
	//getter for username
	public void setUsername(String newUser) {
		username = newUser;
	}
	
	//class method increases balance
	public void deposit(double n) {
		balance += n;
	}
	//class method for withdraws
	public boolean withdraw(double n) {
		if(balance>=n) {
			//if withdraw amount < balance withdraw amount is subtracted from balance and return true
			balance-=n;
			return true;
		}else {
			//if withdraw amount > balance return false
			return false;
		}
	}
	
	//static method for menu options
	public static void displayMenu() {
		System.out.println("----------Options Menu ----------");
		System.out.println("balance --to check Balance");
		System.out.println("deposit --to deposit money");
		System.out.println("withdraw --to Withdraw money");
		System.out.println("exit --to exit the banking system");
		System.out.println("-----------------------------------");

	}
}
