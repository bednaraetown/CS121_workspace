import java.util.Scanner;
//importing the Java scanner
/**
 * Lab 3: Java Character and String Manipulation with a cipher key
 * @author August Bednar
 *
 */
public class Cipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//creates a scanner object
		
		System.out.print("Enter a message: ");
		//prints the opening message
		
		String word = in.nextLine();
		//scans the message input of the user
		
		int lenght = word.length();
		//finds the length of the message
		
		System.out.printf("The length of the message is %d\n", lenght);
		//displays the length
		
		char a = word.charAt(0);
		//establishes a as a char value and assigns it the first char in the message
		
		System.out.printf("The first letter of the message is %c", a);
		//prints the first letter of the given message
		
		System.out.println();
		System.out.println();
		//prints an empty line
		
		System.out.print("Enter the encryption key: ");
		//gives a prompt to the user to enter the key value
		
		int key = in.nextInt();
		//scans the key value
		
		int pos = a;
		pos = a-'A';
		//turns the first letter into an int value and then gives it an alphabet number
		
		System.out.printf("The alphabet position of letter %c is %d", a, pos);
		//prints the letter and its position number
		
		int newPosition;
		newPosition = (pos+key)%26;
		//changes the old position to an encrypted one using the given key
		
		System.out.println();
		System.out.printf("The new position after shifting is %d\n", newPosition);
		//prints the position of the new encrypted letter
		
		char encryptedLetter = (char)('A'+ newPosition);
		//changes the position of the encryption into letter form
		
		System.out.println();
		System.out.printf("The encrypted letter of %c is %c", a, encryptedLetter);
		//prints the original letter and its new encrypted version
		
	}

}
