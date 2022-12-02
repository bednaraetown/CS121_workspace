
public class Employee {


	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	/* constructor */
	public Employee(int id, String fname, String lname, double salary) {
		// TODO: complete the constructor body
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.salary =  salary;

	}


	/* getters */
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	// TODO: write a lastName getter
	public String getLastName() {
		return lastName;
	}


	// TODO: write a salary getter
	public double getSalary() {
		return salary;
	}



	/* setters */
	public void setFirstName(String fname) {
		this.firstName = fname;
	}


	public void setLastName(String lname) {
		// TODO: update the member variable - lastName
		this.lastName = lname;

	}

	 // TODO: write a salary setter
	public void setSalary(double salary) {
		// TODO: update the member variable - lastName
		this.salary = salary;

	}
}
