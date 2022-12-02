import java.util.Scanner;

public class lecture15practice {

	
	public static int factorial(int n) {
		int res = 1;
		
		for (int index =2; index<=n; index++) {
			res =res * index;
		}
		return res;
	}
	public static int power(int n) {
		int res = 1;
		
		for (int index =n; index>1; index--) {
			res =res * 2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char cmd;
		int n;

		do {
			System.out.print("Please enter cmd and n: ");
			cmd = in.next().charAt(0);
			n = in.nextInt();
			
			if (cmd!= 'X' && cmd!='F' && cmd!='P') {
				System.out.println("Error: command invalid!");
			}else if (n<=1 || n>=20) {
				System.out.println("Error: n invalid!");
			}else if (cmd == 'F') {
				System.out.println(factorial(n));
			}else if (cmd == 'P') {
				System.out.println(power(n));
			}
			
		} while(cmd != 'X');
		
		
		
		/**int n;
		boolean isPrime = true;
		System.out.print("Please enter an integer n: ");
		n = in.nextInt();
		
		for(int i = 2; i < n; i++) {
			
			if(n%i==0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.print("Prime");
		} 
		else {
			System.out.print("Composite");
		}*/

		
	}

}
