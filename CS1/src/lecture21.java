
public class lecture21 {

	
	public static void printMatrix(int[][] matrix){
		for(int i = 0;i<matrix.length;i++) {
			for(int j =0;j<matrix[0].length;j++) {
				System.out.printf( "%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void generateMatrix(int width, int height){
		//should be int[][] FIX
		int n1 = 1;
		int n2 = 101;
		
	}
	public static int[][] add(int[][]matrix1, int[][]matrix2){
		
		int row = matrix1.length;
		int column = matrix1[0].length;
		int[][] result = new int[row][column];
		
		for(int i =0; i<row;i++) {
			for(int j = 0;j<column;j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		/**
		int[][] arr = new int [5][10];
		int rows = arr.length;
		int columns = arr[0].length;
		int n = 1;
		for(int i=0; i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j] = n;
				n++;
			}
		}
		//print
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.printf( "%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
		
		int [][] matrix = { 
				{9, 13, 5},
				{1, 11, 7}, 
				{3, 7, 4} };
		printMatrix(matrix);
		int [][] matrix1 = { {8, 4, 9}, {9, 5, 4} };
		int [][] matrix2 = { {1, 9, 10}, {3, 4, 2} };
		int[][] result = add(matrix1, matrix2);
		System.out.print(result);
		*/
		/**
		//raster-scan
		char[][] grids = new char[21][16];
		int rows = grids.length;
		int columns = grids[0].length;
		for(int i = 0; i <rows;i++) {
			for(int j = 0; j<columns;j++) {
				//grids[i][j]
				if( (i%5==0)&&(j%5==0) ) {
					grids[i][j]='+';
				}
				if( (i%5==0)&&(j%5!=0) ) {
					grids[i][j] = '-';
				}
				if( (i%5!=0)&&(j%5==0) ) {
					grids[i][j] = '|';
				}
				if( (i%5!=0)&&(j%5!=0) ) {
					grids[i][j] = ' ';
				}
			}
		}
		*/
		
		int [][] values = new int [4][4]; 

		for (int i=0; i<4; i++) {
		  for (int j=0; j<4; j++) 
		    values[i][j] = i + j;
		}
		printMatrix(values);
		
		
		
		
		

	}
}
