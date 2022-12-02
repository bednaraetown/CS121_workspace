import java.util.Scanner;

public class lecture23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Student[] roster = new Student[20];
		
		for(int i = 0; i < roster.length ;i++) {
			System.out.print("Entera student's name, age, and id: ");
			String name = in.next();
			int age = in.nextInt();
			int id = in.nextInt();
			
			Student std = new Student(name, age, id);
			
			roster[i] = std;
		}
		
		roster[1].setGPA(4.0);
		roster[4].setGPA(3.5);
		
		double sum = 0;
		for(int i = 0; i < roster.length ;i++) {
			sum+= roster[i].getGPA();
		}
		double avg = sum / roster.length;
		

	}

}
