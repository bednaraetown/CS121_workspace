import java.util.Scanner;

/**
 * CS121 Fall 2020
 * lab 6 - Roller
 * @author august Bednar 
 *
 */

public class Roller {

	/**
	 * 
	 * @param n1 - int established in main method
	 * @param n2 - int established in main method
	 * @return - int a randomly generated number
	 */
	public static int getRandomNumber(int n1, int n2) {
		int number = (int) (Math.random() * (n2-n1) + n1);
		return number;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//import scanner
		int n;
		int rand;
		String sequence = "";
		double counter = 0.0;
		//declare vars
		do {
			//do while loop to rerun program until a proper value is given
			System.out.print("Number of rolling: ");
			n = in.nextInt();
			//welcome text and int input by user
			if(n>=5&&n<=100) {
				//if number is between 5 and 100 this runs
				System.out.print("The number sequence: ");
				for(int i =1;i<=n;i++) {
					
					rand = getRandomNumber(1, 7);
					//calls getRandomNumber method
					
					sequence = sequence + String.valueOf(rand);
					//adds value to sequence
					
					if (rand==6) {
						counter++;
						//counts number of 6's obtained
					}	
				}
				System.out.print(sequence);
				counter = counter/n;
				System.out.println();
				System.out.printf("The probability of having 6s: %.3f", counter);
				//finds probability of having a 6 and prints message
				if(counter==0) {
					System.out.println();
					System.out.print("No 6 was found!");
				}else {
					
					int pos = sequence.indexOf('6');
					pos++;
					System.out.println();
					System.out.printf("The first 6 appeared at round %d", pos);
					//finds where first 6 was and tells user
					
				}
				
			}else {
				//prints error message if input is not between 5 and 100
				System.out.print("Error: number of rolling must be [5, 100]!");
				System.out.println();
				System.out.println();
			}
		}while(n <5 || n >100);

	}

}
