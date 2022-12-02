import java.util.Scanner;

public class arrayPractice {

	public static void main(String[] args) {
		
		String[] deck = new String[52];
		int len = deck.length;
		int k = 0;
		String[] values = {"ace", "jack", "queen", "king"};
		String[] suits = {"club", "spade", "diamond", "heart"};
		
		for (int i = 0; i < values.length; i++) {
			//values[i]
			
			for(int j = 0; j < suits.length; j++) {
				//suits[j]
				deck[k++] = values[i] + "-" + suits[j];
				
			}
			
			
		}
		
		for (int i = 2; i <= 10; i++) {
			//i
			
			for(int j = 0; j < suits.length; j++) {
				//suits[j]
				deck[k++] = i + "-" + suits[j];
				
			}
			
			
		}
		
		
		for(k = 0; k < len; k++) {
			System.out.println(deck[k]);
		}
		
		
		
				

	}

}
