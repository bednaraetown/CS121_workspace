
public class Student {
	private String name;
	private int age;
	private double gpa = 0.0;
	private int id;
	
	//constructor
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;	
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getGPA() {
		return gpa;
	}
	public int getID() {
		return id;
	}
	
	//setter
	public void setGPA(double newGPA) {
		gpa = newGPA;
	}
	public void setAGE(int age) {
		this.age = age;
	}
	
	//member matter
	public void birthday() {
		age++;
	}
	public static void greeting() {
		System.out.print("Hello");
	}

}
