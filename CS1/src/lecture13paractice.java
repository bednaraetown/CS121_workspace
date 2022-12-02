import java.util.Scanner;

/**
 * 
 * @author augus
 *
 */

public class lecture13paractice {

	public static void main(String[] args) {
		/**Scanner in = new Scanner(System.in);
		String command = "";
		
		do {
			System.out.print("Enter a command: ");
			command = in.next();
			
			if( command.equals("attack")) {
				System.out.println("Attack!");
			}else if (command.equals("defense")) {
				System.out.println("Defense!");
			}else if (command.equals("move")) {
				System.out.println("Move forward!");
			}
			
		} while (!command.equals("quit") );
		**/
		int i;
		for (i=1; i<=100; i++) {
			if(i%3 ==0 && i%5 ==0) {
				System.out.println("FizzBuzz");
			} else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
			
		}
		
	}
	

}
