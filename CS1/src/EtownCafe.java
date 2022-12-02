import java.util.Scanner;

/**
 * CS121 Fall 2020
 * Project 2 - Etown Cafe
 *
 * @author august bednar
 *
 */
public class EtownCafe {

	
	
	// all the drink names
	static String[] drinkNames = {"*No Selection*", "Cappuccino", "Espresso", "Chai Latte", "Matcha Green Tea Lattle",
									"English Breakfask Tea", "Hot Chocolate", "Apple Juice", "Cold Coffee", "Iced Tea"};

	// the corresponding drink prices
	static double[] drinkPrices = {0.00, 5.50, 4.99, 3.99, 4.50, 4.00, 4.50, 2.99, 4.5, 4.00};


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String customerName = "";

		double totalCost = 0;


		//display the welcome message
		System.out.print("***** Welcome to Etown Cafe! *****");
		System.out.println();
		


		//ask for customer's name and read in the name
		System.out.print("What's your first name? ");
		customerName = in.next();
		


		// display the drinks menu. You need to complete the displayMenue() method to make the below line works.
		displayMenu();


		//ask for drinks numbers and read in the number entered by the customer
		System.out.printf("%s, how many drinks would you like to order? ", customerName);
		int drinks = in.nextInt();
		
		



		//take each drink order and save its drink index in an integer array
		int[] drinkOrders = new int[drinks];
		if(drinks>0) {
			for(int i= 0; i < drinks; i++) {
				System.out.printf("Please enter a drink # for order %d: ", i+1);
				int drinkNumber = in.nextInt();
				drinkOrders[i] = drinkNumber;
				
			}
			System.out.println();
			System.out.print("Your order consists of: ");
			System.out.println();
			// display order details when order contains at least 1 drink
			
			for(int i = 0; i < drinkOrders.length; i++) {
				
				System.out.print(drinkNames[drinkOrders[i]]+ " -- ");
				System.out.printf("$%.2f", drinkPrices[drinkOrders[i]]);
				System.out.println();
				
			}
			System.out.println();
			
		}else {
			// otherwise, print message "You didn't order any drinks."
			System.out.println();
			System.out.print("You didn't order any drinks.");
			System.out.println();
		}
		
		
		


		
		



		// getting the total cost by calling the getTotalCost() method
		
		totalCost = getTotalCost(drinkOrders);
		


		// print out the total cost
		System.out.printf("\nThank you, %s. Your order is $%.2f dollars in total.", customerName, totalCost);

	}



	/**
	 * display the drinks menu
	 * */
	public static void displayMenu() {

		System.out.println();
		System.out.println("** Etown cafe menu **");

		// use a for loop to display Etown cafe drinks menu. DO NOT hard coding
		// hint: you will need to use the global variables drinkNames and drinkPrices

		
		int j = 0;
		for(int i = 0; i < drinkNames.length; i++) {
			System.out.printf(" %d. ", j);
			j++;
			System.out.print(drinkNames[i]+ " -- ");
			System.out.printf("$%.2f", drinkPrices[i]);
			System.out.println();
			
		}


		System.out.println();

	}


	/**
	 * Calculate the total cost of the drink orders.
	 * @param orders - an array of drink indices ordered by the customer
	 * @return total - the total cost of the drink orders
	 * */
	public static double getTotalCost(int[] orders) {
		double total = 0.0;

		for(int i = 0; i <orders.length; i++) {
			total += drinkPrices[orders[i]];
		}
		//calculate the total cost of the drink orders



		return total;
	}


}
