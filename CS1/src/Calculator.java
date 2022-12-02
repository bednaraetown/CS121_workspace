import java.util.Scanner;
/**
 * Calculator takes two double vars and performs a math operation based on a operator input
 * @author august bednar
 *
 */
public class Calculator {

	
	/**
	 * 
	 * @param n - an int number greater than 0
	 * @return harmonic calculation of n
	 */
	public static double harmonic(int n) {
		
		double sum=0;
		//defining a variable at 0 to keep the answer
		
		for(double i = 1; i <= n; i++) {
			sum=sum+(1/i);
			//formula for harmonic function
		}
		return sum;
	}
	
	/**
	 * 
	 * main matter takes inputs gives outputs and all math other than harmonic matter
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//creating scanner 
		System.out.println("** Welcome to use CS121 calculator **");
		//one time welcome message
		System.out.println();
		double number1;
		double number2;
		char operator;
		//creating variables for inputs
		
		
		do{
			//the do-while loop starts running and then checks to see if it will continue to run
			System.out.print("Enter command: ");
			number1 = in.nextDouble();
			operator = in.next().charAt(0); 
			number2 = in.nextDouble();
			//scans the inputs and assigns it to 3 vars
			if(operator== '*') {
				double product;
				product= number1 * number2;
				//if the mult operator is detected then the two numbers are multiplied here
				System.out.printf("%.4f %c %.4f = %.4f\n", number1, operator, number2, product);
				System.out.println();
			}else if(operator=='/') {
				if(number2==0) {
					//if division is given this checks for the denominator being 0
					System.out.printf("Error: Cannot divide by zero!\n");
					System.out.println();
				}else {
					double quotient;
					quotient = number1/number2;
					//if the division operator is detected then the two numbers are divided here
					System.out.printf("%.4f %c %.4f = %.4f\n", number1, operator, number2, quotient);
					System.out.println();
				}
				
			}else if(operator=='^') {
				double answer;
				answer = Math.pow(number1, number2);
				//this raises number1 to the power of number 2
				System.out.printf("%.4f %c %.4f = %.4f\n", number1, operator, number2, answer);
				System.out.println();
			}else if(operator=='H') {
				if(number1<=0) {
					//checks that if H is given number1 is greater than 0
					System.out.printf("Error: Invalid number %.4f!\n", number1);
					System.out.println();
				}else {
					int n = (int) number1;
					double answer = harmonic(n);
					//calls the harmonic operator if requirements are met
					System.out.printf("H(%d) = %.4f\n", n, answer);
					System.out.println();
				}
				
			}else if(operator=='Q'){
				break;
				//if Q is detected then the loop stops
			}else {
				System.out.printf("Error: Invalid Operator %c!\n", operator);
				//if any other operators are given then an error message is displayed
				System.out.println();
			}
			
			
		}while(operator != 'Q');
		//loop stops if Q is entered

	}

}
