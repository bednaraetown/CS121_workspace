
public class lecture20 {

	
	public static boolean either24(int[] nums) {
		boolean two = false;
		boolean four = false;
		
		if(nums.length<=1) {
			return false;
		}
		
		for(int i = 0; i < nums.length-1; i++) {
			int n1 = nums[i];
			int n2 = nums[i+1];
			
			if(n1 == 2 && n2 == 2) {
				two = true;
			}
			if(n1 == 4 && n2 == 4) {
				four = true;
			}
		}
		return two ^ four;
	}
	public static int update(int n) {
		n=12;
		return n;
	}
	public static void update(int[] arr1) {
		arr1[0] = 1;
		
	}
	public static void main(String[] args) {
		
		//2d - 3x3 table
		int [][] numbers1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		//or - first number is rows 2nd is columns 
		int [][] numbers = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		
		for(int i = 0; i<4; i++) {
			//numbers[i] is {1,2,3,4,5}
			for(int j =0;j<5;j++) {
				//numbers[i][j] is one number
			}
		}
		int [][] table = new int[5][10];
		int label = 1;
		for(int i = 0;i<5;i++) {
			for(int j = 0; j <10;j++) {
				table[i][j]=label;
				label++;
			}
		}
	}

}
