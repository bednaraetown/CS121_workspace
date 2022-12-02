import java.util.Scanner;
/**
 * 
 * @author august bednar
 *
 */

public class lecture6practice {

	public static void main(String[] args) {
		
		System.out.print("Enter the temperature in Celcius: ");
		Scanner in = new Scanner(System.in);
		double c = in.nextDouble();
		double f;
		
		f = (9.0/5.0)*c+32;
		System.out.printf("It is %.2f°F", f);
		
		

	}

}
