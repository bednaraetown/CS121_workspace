/**
 * Lab test 2 starter code - GameBoard Class
 * @author august bednar
 * */
public class GameBoard {
	// member variable
		private char[][] board = new char[3][3];


		// constructor
		public GameBoard() {

			// initialize an empty game board
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					//assign a single space character ' ' to board[i][j]

					board[i][j] = ' ';

				}
			}

		}



		/**
		 * print the member
		 * */
		public void display() {
			for(int i =0;i<board.length;i++) {
				for(int j =0;j<board[0].length;j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
				
			}
			// print the game board
			// hint: be sure to match the output format on the test cases





		}


		/**
		 * place a mark on the game board
		 * @param mark - a character either 'X' or 'O'
		 * @param row - a row number
		 * @param col - a column number
		 * @return true when successfully placed a mark on the game board
		 *         false when there's already a mark 'X' or 'O' at the corresponding location on the board
		 * */
		public boolean updateBoard(char mark, int row, int col) {

			int rowIndex = row - 1;
			int colIndex = col - 1;

			// TODO: place the mark on the board at rowIndex and colIndex if there are no marks
			// return true after successfully placed the mark
			if( board[rowIndex][colIndex] == ' ' ) {
				board[rowIndex][colIndex] = mark;
				return true;




			}else {
				return false;
			}
		}


		/**
		 * the helper method of win()
		 * check if three marks are the same
		 * @param mark1 - a mark either 'X' or 'O'
		 * @param mark2 - a mark either 'X' or 'O'
		 * @param mark3 - a mark either 'X' or 'O'
		 * @return true/fase - representing whether the three marks are the same
		 * */
		public boolean sameMarks(char mark1, char mark2, char mark3) {
			boolean same = false;

			if( mark1 != ' ' && mark2 != ' ' && mark3 != ' ' ) {
				if ( mark1 == mark2 && mark1 == mark3 ) {
					// TODO: update same
					same = true;


				}
			}

			return same;
		}


		/**
		 * check if the game ends in a win
		 *
		 * In order to win the game, a player must place three of their
		 * marks in a horizontal, vertical, or diagonal row.
		 *
		 * @return true/false - representing whether the game ends in a win
		 * */
		public boolean win() {

			// check rows
			for(int i = 0; i < board.length; i++) {
				if ( sameMarks(board[i][0], board[i][1], board[i][2]) ) {
					return true;
				}
			}

			//check columns
			for(int i = 0; i < board[0].length; i++) {
				if ( sameMarks(board[0][i], board[1][i], board[2][1]) ) {
					return true;
				}
			}




			// check one diagonal
			if ( sameMarks(board[0][0], board[1][1],board[2][2]) ) {
					return true;
			}

			//check the other diagonal
			if ( sameMarks(board[2][0], board[1][1],board[0][2]) ) {
				return true;
			}





			// return false if none of the above return true.
			return false;
		}



		/**
		 * assume there’s no winner, check if the game ends in a draw.
		 * @return true/false - representing whether the game ends in a draw
		 * */
		public boolean draw() {
			// TODO: return true if the game board is fully occupied with 'X's and 'O's,
			// return false otherwise.
			
			int counter = 0;
			for(int i = 0; i<board.length; i++) {
				for(int j = 0; j<board[0].length;j++) {
					if(board[i][j] == ' ') {
						counter++;
					}
				}
			}
			if(counter>0) {
				return false;
				
			}else {
				return true;
			}



		}









}
