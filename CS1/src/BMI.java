import java.util.Scanner;

/**
 * Lab 2: is a BMI calculator
 * @author August Bednar
 *
 */
public class BMI {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double weightIn;
		double res1;
		//create variable for conversion of weight
		
		System.out.print("Enter the weight (lb): ");
		weightIn = in.nextDouble();
		//this is asking the user to enter their weight in lb and scanning their answer
		
		
		double heightIn;
		double res2;
		//create variable for conversion of height
		
		System.out.print("Enter the height (inch): ");
		heightIn = in.nextDouble();
		//this is asking the user to enter their height in inch and scanning their answer
		
		res1 = weightIn / 2.2;
		//Calculates weight in kg
		
		res2 = heightIn / 39.37;
		//calculates height in m
		
		System.out.println();
		//printing an empty line
		
		System.out.printf("Your weight (kg) is %.2f kg.\n", res1);
		//displays new weight in kg
		
		System.out.printf("Your height (m) is %.2f m.\n", res2);
		//displays new height in m
		
		
		double res3;
		//creating a variable for the result of BMI calculation
		
		res3 = res1 / (res2 * res2);
		//this is calculating BMI from the given numbers
		
		System.out.printf("Your BMI is %.2f.", res3);
		//print the final BMI calculation
		
	}

}
