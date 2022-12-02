import java.util.Scanner;
/**
 * In class practice for lecture 10 if-else
 * @author August Bednar
 *
 */
public class lecture10practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//System.out.print("Please enter an x value: ");
		//double x = in.nextDouble();
		//System.out.print("Please enter an y value: ");
		//double y = in.nextDouble();
		
		//if ( x>=0 ) {
			//if ( y>=0 ) {
				//System.out.print("The point is in quadrant 1.");
			//} else {
				//System.out.print("The point is in quadrant 4.");
			//}
		//} else {
			//if( y>=0 ) {
				//System.out.print("The point is in quadrant 2.");
			//} else {
				//System.out.print("The point is in quadrant 3.");
	//		}
		//}
		
				int n = 75;
				boolean isWeekend = true;
				
				if ( (!isWeekend) && n >= 40 && n<=60) {
					System.out.print("Success");
				}
				else if ( isWeekend && n >=40) {
					System.out.print("Success");
				}
				else {
					System.out.print("fail");
				}
		}

}
