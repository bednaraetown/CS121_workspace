import java.util.Scanner;
/**
 * Lab 4: this is a clock conversion from 12hr to 24hr time
 * @author August Bednar
 *
 */


/**
 * convert the time into a 24hr style
 * @param hh - a number from [1,12]
 * @param hh - a number from [0,59]
 * @param ampm - string saying am or pm
 * @return time in 24hr notation
 */
public class clock {

	public static void convert(int hh, int mm, String ampm) {
		
		int hour;
		
		if( hh == 12 ) {
			if( ampm.equals("am") ) {
				hour=0;
				System.out.printf("The 24-hour time is %02d:%02d", hour, mm);
				//prints time if input hour is 12 and is in am
			}
			else if( ampm.equals("pm") ) {
				
				System.out.printf("The 24-hour time is %02d:%02d", hh, mm);
				//prints time if input hour is 12 and is in pm
			}
		}
		else if( hh >= 1 && hh <= 12 ) {
			if(ampm.equals("am")) {
				
				System.out.printf("The 24-hour time is %02d:%02d", hh, mm);
				//print time if input hour is between 1 and 12 and is in am
			}
			else if( ampm.equals("pm")) {
				
				hour = hh+12;
				System.out.printf("The 24-hour time is %02d:%02d", hour, mm);
				//adds 12 to input hour and prints time to give 24 hour time
			}
		}
		
		
	}
	/**
	 * 
	 * @return error messages
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//creates scanner 
		System.out.print("Please enter a 12-hour time in format [hh mm ampm]:");
		int hh = in.nextInt();
		int mm = in.nextInt();
		String ampm = in.next();
		//assigns input to variables
		System.out.println();
		
		if(hh < 1 || hh >12 ) {
			System.out.print("Error: hour (hh) must be [1, 12]!");
			//looks for error in hh input and reports it
		}
		else if( mm < 0 || mm > 59 ) {
			System.out.println("Error: minute (mm) must be [0, 59]!");
			//looks for error in mm input and reports it
		}
		else if(!ampm.equals("am") && !ampm.equals("pm")) {
			System.out.println("Error: [am/pm] must be either am or pm!");
			//looks for error in ampm input and reports it
		}
		else {
		convert(hh, mm, ampm);
		//executes convert method if no errors in input
		}

	}

}
