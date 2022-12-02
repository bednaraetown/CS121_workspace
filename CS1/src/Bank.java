import java.util.Scanner;

/**
 * bank operation program to change balance of an account
 * @author august bednar
 *
 */
public class Bank {

	/**
	 * prompts the user to enter information to check a bank account
	 * 
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//create scanner
		
		
		
		System.out.println("**** Welcome to Etown Bank ****");
		System.out.print("Enter a username to open an account: ");
		//greeting message and opening prompt
		
		String name = in.next();
		//collects account name
		Account acc = new Account(name);
		//creates account using name given
		System.out.println();
		Account.displayMenu();
		//calls the static displayMenu class method
		System.out.println();
		String opt = "";
		//creates new string for user input
		do {
			//do-while loop to run main body of program
		System.out.print("Please enter an option: ");
		opt = in.next();
		//user input option
		if(opt.equals("balance")) {
			//runs if user inputs "balance"
			double bal = acc.getBalance();
			//calls getBalance in Account class
			System.out.printf("Your account balance is $%.2f.", bal);
			//print balance
			System.out.println();
			System.out.println();
		}else if(opt.equals("deposit")) {
			//runs if user inputs "deposit"
			System.out.print("How much would you like to deposit? ");
			double dep = in.nextDouble();
			//reads desired deposit amount and assigns it to the account using deposit method in Account class
			acc.deposit(dep);
			System.out.printf("You have successfully deposited $%.2f.", dep);
			//prints success message with amount
			System.out.println();
			System.out.println();
		}else if(opt.equals("withdraw")) {
			//runs if user inputs "withdraw"
			System.out.print("How much would you like to withdraw? ");
			double wit = in.nextDouble();
			boolean check = acc.withdraw(wit);
			//calls the withdraw method and assigns its boolean value to a var
			if(check == true) {
				//runs if enough money in account
				System.out.printf("You have successfully withdrawn $%.2f.", wit);
				System.out.println();
				System.out.println();
			}else if(check == false) {
				//runs if balance is too low
				System.out.print("Error: Your account doesn't have enough money to withdraw!");
				System.out.println();
				System.out.println();
			}
		}else if(opt.equals("exit")) {
			break;
			//stops loop if "exit" is entered
		}else {
			//error message if invalid option input
			System.out.println("Error: invalid option!");
			System.out.println();
		}
		}while(!opt.equals("exit"));
		//if exit is entered loop stops and exit message is printed
		System.out.print("Thank you for choosing Etown Bank.");
		
	}

}
