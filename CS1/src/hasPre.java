
public class hasPre {

	public static void main(String[] args) {
	
		int[][] mat = {{1, 2, 3}, {1, 2, 2}};
		int num =3;
		System.out.print(matrixSearch(mat, num));

	}
	public static int[] matrixSearch (int[][] mat, int num) {
		  // TODO: get the total rows and columns of the mat 2D array
		  int row = mat.length;
		  int col = mat[0].length;
		  
		  
		  // TODO: declare a new array of integers with row as the length
		  int[] res = new int[row];

		  // TODO: loop through the mat 2D array
		  for(int i = 0;i<row;i++) {
		    for(int j = 0; i<col;i++) {
		        // TODO: res[i] should be updated only when the num is 
		        // found for the first time in current row

		    	if(num==mat[i][j]) {
		    		res[i] = i;
		    		break;
		    	}


		    }
		  }

		  // TODO: return the res array
		  return res;


		}

}
