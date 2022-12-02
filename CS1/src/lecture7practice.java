import java.util.Scanner;
public class lecture7practice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Your first and last name: ");
		String First = in.next();
		String Last = in.next();
		
		char fIn;
		char lIn;
		
		fIn = First.charAt(0);
		lIn = Last.charAt(0);
		System.out.print("Your Initials are: ");
		System.out.printf("%c%c", fIn, lIn);
		
	}

}
