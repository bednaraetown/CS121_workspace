import java.util.Scanner;
/**
 * Lab test 2 starter code - the tic-tac-toe game
 * @author august bednar
 * */
public class TicTacToe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String player1;
		String player2;

		int turns = 0;
		boolean endGame = false;


		System.out.print("Enter the name of player1: ");
		player1 = in.nextLine();
		System.out.printf("%s, your marks are 'X's.\n\n", player1);

		System.out.print("Enter the name of player2: ");
		player2 = in.nextLine();
		System.out.printf("%s, your marks are 'O's.\n\n", player2);

		// declare a new GameBoard object - board
		GameBoard board = new GameBoard();

		// start the tic-toc-toe game
		
		
		do {
			String player; // current player
			char mark; // current mark



			// update the current player and current mark based on turns.
			
			if( turns%2 == 0 ) {
				player = player1;
				mark = 'X';
			} else {
				player = player2;
				mark = 'O';
			}

			System.out.printf("\n%s, enter a row number and a column number to put your mark on the game board:  ", player);
			int row = in.nextInt();
			int col = in.nextInt();

			// place a mark on the game board
			// hint: call the updateBoard() method attached with the board object
			boolean flag = board.updateBoard(mark, row, col);





			if( flag == false ) {
				System.out.printf("Error! There is already a mark at row %d, column %d. \n", row, col);
			}
			else {

				board.display();
				// displace the game board
				// hint: call the display() method attached with the board object





				// check if the game end with a win or a draw
				if( board.win() ) {
					System.out.printf("\n%s wins! \n\n", player1);
					endGame = true;
				}
				else if ( board.draw() ) {
					System.out.println("\nDraw. Game over! \n");
					endGame = true;
				}


				turns++;
			}


		} while ( endGame == false );


	}


}
