import java.util.Scanner;

public class RasterScan {

	/**
	 * 
	 * @param width- user input int number
	 * @param height- user input int number
	 * @return- a char type 2d array
	 */
	public static char[][] reset(int width, int height){
		char[][] grids = new char[height][width];
		//creates new 2d array with specified length and width
		int rows = grids.length;
		//finds number of rows
		int columns = grids[0].length;
		//finds number of columns
		for(int i = 0; i <rows;i++) {
			//for loop to enter values into rows
			for(int j = 0; j<columns;j++) {
				//for loop to enter values into columns
				//grids[i][j]
				if( (i%5==0)&&(j%5==0) ) {
					grids[i][j]='+';
					//assigns + if both are divisible by 5
				}
				if( (i%5==0)&&(j%5!=0) ) {
					grids[i][j] = '-';
					//assigns - if i is divisible by 5
				}
				if( (i%5!=0)&&(j%5==0) ) {
					grids[i][j] = '|';
					//assigns | if j is divisible by 5
				}
				if( (i%5!=0)&&(j%5!=0) ) {
					grids[i][j] = ' ';
					//assigns a space if neither is divisible by 5
				}
			}
		}
		return grids;
		//returns created array
	}
	/**
	 * 
	 * @param grids- a char type 2d array (should be the one creates in reset method)
	 * prints the array along with labels
	 */
	public static void print(char[][] grids) {
		
		for(int i =0;i<grids.length;i++) {
			//loop to print each row left to right
			if(i%5 == 0) {
				//if statement to print the y-axis labels
				System.out.printf("%2d ", grids.length-i-1);

			}else {
				System.out.print("   ");
			}
			for(int j =0;j<grids[0].length;j++) {
				//loop to print the value in each column
				System.out.printf( "%c", grids[i][j]);
			}
			System.out.println();
		}
		System.out.print("   ");
		for(int j =0;j<grids[0].length;j++) {
			//loop to print x-axis labels
			if(j%5 == 0) {
				//this if statement prints the x-axis values
				System.out.printf("%d", j);
				System.out.print("   ");
				if(j<9) {
					System.out.print(" ");
				}
			}
			
		}
	}
	
	/**
	 * 
	 * main body of the program to check inputs and call reset and print methods
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String input;
		//do-while loop to keep program running
		do {
			System.out.print("Enter command: ");
			input = in.next();
			//initial prompt and takes command
			if(input.equals("update")) {
				//continues program if command is 'update'
				System.out.print("Enter width and height: ");
				int width = in.nextInt();
				int height = in.nextInt();
				//get users height and length
				if((width > 0 && width < 100) && ((width-1) % 5 ==0)) {
					if((height > 0 && width < 100) && ((width-1) % 5 ==0)) {
						//if numbers are in correct range calls reset method with those values
						char[][] res =reset(width,height);
						//calls print method to print created array
						print(res);
						System.out.println();
						System.out.println();
					}
				}else{
					//prints error message if numbers are not in range
					System.out.print("Error: width and height must be in (0, 100)!");
					System.out.println();
					System.out.println();
				}
			}else if(input.equals("exit")){
				//ends program if command is 'exit'
				System.out.print("** See you next time... **");
			}else {
				//reprompts user if command invalid
				System.out.print("Error: command must be either update or exit!");
				System.out.println();
				System.out.println();
			}
		}while(!input.equals("exit"));
		
		
		
	}

}
