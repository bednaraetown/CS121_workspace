import java.util.Scanner;

/**
 * this program takes a user input number from 1 to 20 and finds its sum of factorials
 * @author august bednar
 *
 */
public class FactorialSum {

	/**
	 * calculate the factorial of n
	 * @param n - a int number 
	 * @return the factorial of n
	 */
	public static int factorial(int n) {
		
		int sum = 1;
		int factor = n;
		//defining vars first
		while( factor != 0) {
			sum = sum * factor;
			factor--;
			//these two math functions carry out the job of the factorial function
		}
			return sum;
			
	}
	
	/**
	 * finds the sum of the factorial of a number
	 * @param n - an int number
	 * @return sum of factorial of n
	 */
	public static int factorialSum(int n) {
		
		int sum = n;
		int factor = 0;
		int total = n;
		//define variables first
		
		while(sum != 0) {
			//program will keep running until sum = 0
			factor =  factor + factorial(total);
			//taking a factorial then adding and assigning it to factor variable
			sum--;
			//counting down to 0 so that the program stops when wanted
			total--;
			//decreases the number being factorialed every time program is run
		}
		
		return factor;
	}
	
	/**
	 * 
	 * this method gets the number input and checks it then calls on factorialSum method for calculations
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		
		do{
			System.out.print("Enter an integer number n: ");
			n = in.nextInt();
			//prompts user to enter number
			if(n < 1 || n > 20 ) {
				System.out.print("Error: n must be between 1 and 20.\n");
				//error message given if wrong number is enterd
			}
		} while (n < 1 || n > 20 );
		//stops program once value entered is inside peram
		double ans = factorialSum(n);
		//converts the result to a double type var
		System.out.printf("Given n = %d, sum(n) = %.4f", n, ans);
		//prints out answer
		

	}

}
