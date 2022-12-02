
public class HR {

	public static void main(String[] args) {
		
		
		// first employee object 
		Employee emp1 = new Employee(1, "Alice", "Arendelle", 98000.00);
		System.out.println("The name of employee 1 is " + emp1.getFirstName() + " " + emp1.getLastName());
		
		// update first employee's name
		emp1.setLastName( "Hope" );
		System.out.println("The new name of employee 1 is " + emp1.getFirstName() + " " + emp1.getLastName());
		
		System.out.println();
		
		// second employee object 
		Employee emp2 = new Employee(2, "Bob", "Faith", 99999.00);
		System.out.printf("The salary of employee 2 is %.2f \n", emp2.getSalary());
		
		// update second employee's salary
		emp2.setSalary(100000.0);
		System.out.printf("The updated salary of employee 2 is %.2f \n", emp2.getSalary());
		

		
	}

}
