
public class Poker {

	/**
	 * 
	 * @return string array that has a deck of 52 cards
	 */
	public static String[] generateCards() {
		String[] deck = new String[52];
		//empty array to be filled with cards
		int k = 0;
		String[] values = {"ace", "jack", "queen", "king"};
		//arrray with face valuse
		String[] suits = {"clubs", "spades", "diamonds", "hearts"};
		//array with suits
		
		for (int i = 0; i < values.length; i++) {
			//values[i]
			for(int j = 0; j < suits.length; j++) {
				//suits[j]
				deck[k++] = values[i] + "-" + suits[j];
				//nested for loop that creates the face cards by assigning value to suit
			}	
		}
		for (int i = 2; i <= 10; i++) {
			//i
			for(int j = 0; j < suits.length; j++) {
				//suits[j]
				deck[k++] = i + "-" + suits[j];
				//nested for loop that creates numbered cards by assigning number to suit
			}
		}
		return deck;
	}
	
	/**
	 * 
	 * @param deck
	 * @return
	 */
	public static String[] shuffle(String[] deck) {
		int size = deck.length;
		//finds the length of array
		for(int i=0;i<size;i++) {
			int j = (int)(Math.random()*size);
			//finds a random value of array to swap values with
			String temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
			//these three vars are used to trade values of deck[i] and deck[j]
		}
		return deck;
	}
	
	public static void main(String[] args) {
		int k = 0;
		
		System.out.println("The generated cards:");
		String[] deck = generateCards();
		//calls the generateCards method and assigns it to an array
		int len = deck.length;
		//finds length of array
		for(k = 0; k < len; k++) {
			System.out.print(deck[k]+", ");
			//this for loop prints the deck of cards
		}
		System.out.println("");
		System.out.println("");
		System.out.println("The shuffled cards:");
		String[] shuffle = shuffle(deck);
		//assigns the shuffle method result to an array
		int lenShuffle = shuffle.length;
		//finds length of shuffled array
		for(k = 0; k < lenShuffle; k++) {
			System.out.print(deck[k]+", ");
			//prints the shuffled array
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Player1's cards:");
		for(k = 0; k < lenShuffle; k++) {
			System.out.print(deck[k]+", ");
			//prints cards starting from the 1st position and dealing every other card
			k++;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Player2's cards:");
		for(k = 1; k < lenShuffle; k++) {
			System.out.print(deck[k]+", ");
			//prints cards starting from the 2nd position and dealing every other card
			k++;
		}
		

	}

}
