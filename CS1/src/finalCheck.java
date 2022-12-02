
public class finalCheck {

	public static void printMatrix(double[][] mat) {
		// TODO (2 points): get the number of rows and columns of the 2D array 
		int row = mat.length;
		int col = mat[0].length;
			
		// loop through the 2D array
	        // TODO (6 points): finish the loop headers and loop body to match test cases
		for(int i = 0;i<row;i++) {    
			for(int j = 0;j<col;j++) {
				System.out.print(mat[i][j] +" ");		
			}
			System.out.println();

		}
	}



	public static double[][] matrixFlip (double[][] mat) {
		// TODO (2 points): get the number of rows and columns of the 2D array 
		int row = mat.length;
		int col = mat[0].length;
			
		// Outer loop runs through all the rows of the 2D array
	        // TODO (2 points): finish the loop header
		for(int i = 0;i<row;i++) { 
			// Inner loop runs mid-way through the columns
			for(int j = 0; j < col/2; j++){
				// TODO (8 points): flip a row
				if(j==0) {
					double sto = mat[i][(j+3)%4];
					mat[i][(j+3)%4] = mat[i][j];
					mat[i][j]= sto;
				}else if(j==1) {
					double sto2 = mat[i][j+1];
					mat[i][j+1] = mat[i][j];
					mat[i][j]= sto2;
				}
				
				
				
					
			}
		}
			
		return mat; // return the flipped 2D array
	}
	
	public static void main(String[] args) {
		// Create a matrix
		double [][] myMat = {
			{3.5, 4.5, 5.5, 6.5},
			{1.0, 2.0, 3.0, 4.0},
			{6.1,7.1, 8.1, 9.1}
		};
				
		// Calling the matrixFlip method
		double [][] result = matrixFlip(myMat);
				
		// Print the flipped matrix
		printMatrix(result);
		

		
	}

}
