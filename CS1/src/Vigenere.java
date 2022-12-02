import java.util.Scanner;
/**
 * Vigenere cipher that encrypts a 3 letter message using a 3 letter key
 * @author august bednar
 *
 */
public class Vigenere {

	/**
	 * 
	 * @param letter- char taken from the first user input message
	 * @param keyLetter- char taken from the user input key
	 * @return- char calculated by adding the letter and keyLetter with modulo of 26
	 */
	public static char encrypt(char letter, char keyLetter) {
		
		int position = letter - 'A';
		//converts letter to its number value
		int change = keyLetter - 'A';
		//converts keyLetter to its number value
		int newPosition = ((position + change)%26 + 'A');
		//adds the two values and takes modulo 26 so it stays in alphabet
		char result = (char)(newPosition);
		return result;
		//returns new encrypted char
		
	}
	/**
	 * 
	 * @param message- user input message obtained in main matter
	 * @param keywords- user input key obtained in main matter
	 * @return- String that is encrypted using the encrypt matter
	 */
	public static String encrypt(String message, String keywords) {
		char letter1 = message.charAt(0);
		char letter2 = message.charAt(1);
		char letter3 = message.charAt(2);
		char keyLetter1 = keywords.charAt(0);
		char keyLetter2 = keywords.charAt(1);
		char keyLetter3 = keywords.charAt(2);
		char newLetter1 = letter1;
		char newLetter2 = letter2;
		char newLetter3 = letter3;
		//defining variables
		
		if(letter1>='A' && letter1<='Z') {
			newLetter1 = encrypt(letter1, keyLetter1);
			//calls encrypt matter if letter1 value is a letter
			if(letter2>='A' && letter2<='Z') {
				newLetter2 = encrypt(letter2, keyLetter1);
				//calls encrypt matter if letter2 value is a letter
				if(letter3>='A' && letter3<='Z') {
					newLetter3 = encrypt(letter3, keyLetter3);
					//calls encrypt matter if letter3 value is a letter
				}
			}else if(letter3>='A' && letter3<='Z') {
				newLetter3 = encrypt(letter3, keyLetter2);
				//calls encrypt matter if letter3 value is a letter
			}
		}else if(letter2>='A' && letter2<='Z') {
			newLetter2 = encrypt(letter2, keyLetter1);
			//calls encrypt matter if letter2 value is a letter
			if(letter3>='A' && letter3<='Z') {
				newLetter3 = encrypt(letter3, keyLetter2);
				//calls encrypt matter if letter3 value is a letter
			}else if(letter3>='A' && letter3<='Z') {
				newLetter3 = encrypt(letter3, keyLetter3);
				//calls encrypt matter if letter3 value is a letter
			}
		}else if(letter3>='A' && letter3<='Z') {
			newLetter3 = encrypt(letter3, keyLetter3);
			//calls encrypt matter if letter3 value is a letter
		}
		String newMessage = "";
		newMessage += "" + newLetter1 + newLetter2 + newLetter3;
		//adds the new encrypted letters to a string
		
		return newMessage;
		//returns encrypted string
		
	}
	/**
	 * 
	 * main matter prints the messages and gathers user inputs then calls on the encrypt matters to do the math
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter message (3 characters): ");
		String message = in.next();
		if (message.length() == 3) {
			//if length of message is correct this is executed
			System.out.print("Enter keyword (3 characters): ");
			String keywords = in.next();
			if (keywords.length() == 3) {
				System.out.println();
				message = message.toUpperCase();
				//makes message upper-case
				System.out.printf("Your message: %s\n", message);
				//reprints user input message
				keywords = keywords.toUpperCase();
				//makes keywords upper-case
				System.out.printf("Your keyword: %s\n", keywords);
				//reprints user input keyword
				System.out.print("Your ciphertext: " + encrypt(message, keywords));
				//calls encrypt matter and prints out answer
			} else {
				System.out.print("Input Error: The keyword must contain three characters!");
				//error message for the incorrect length of keyword
			}
		} else {
			System.out.print("Input Error: The message must contain three characters!");
			//error message for the incorrect length of message
		}
			
		

	}

}
