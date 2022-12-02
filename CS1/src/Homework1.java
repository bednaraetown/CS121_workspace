/**
 * adds arrays
 * @author august bednar
 *
 */
public class Homework1 {

	/**
	 * 
	 * @param double type array
	 * @return- a single double number that was the sum of the array input 
	 */
	public static double addition(double[] array){ 
        double sum = 0;
        
        for (int i = 0; i < array.length; i++) 
        	//for loop that adds each iteration of the array to an int value one by one
           sum +=  array[i]; 
       
        return sum;
    }
	
	/**
	 * 
	 *calls addition method to find sum of array
	 */
	public static void main(String[] args) {
		
		double[] doubleArray = new double[]{ 1.20,   3.40,   5.60 };
		//creates an array with 3 specified values
		System.out.println(addition(doubleArray));
		//calls and prints addition method
		
		double[] loopArray = new double[1000];
		//creates a array with 1000 values not yet specified
		for(int i = 0; i <loopArray.length; i++) {
			loopArray[i] = (i+1);
		}
		//a for loop that assigns numbers 1-1000 in the new array
		System.out.println(addition(loopArray));
		//calls and prints addition method

	}

}
