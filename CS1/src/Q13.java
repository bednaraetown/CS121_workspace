
public class Q13 {

	public static void main(String[] args) {
		// TODO: Q7
		// Create an array of 5 circles called myCircles
		// You must use a for loop to instantiate each circle
		// You must NOT hard-code the loop iterations
		Circle myCircles[] = new Circle[5];
		for(int i = 0;i<0;i++) {
			myCircles[i]=  new Circle();
		}
		


		// TODO: Q8
		// Reposition the first circle in the array by shifting
		// it downwardly by a distance of 5. Then resize the  
		// shifted circle by applying a shrinking rate of 0.5
		myCircles[0].shift('v', (-5));
		myCircles[0].resize(0.5);
		
		

		
		// TODO: Q9
		// Calculate and print the areas and perimeters
		//   of all circles in the myCircles array
		for(int i = 0; i<myCircles.length;i++) {
			System.out.print(myCircles[i].area());
		}
		for(int i = 0; i<myCircles.length;i++) {
			System.out.print(myCircles[i].perimeter());
		}
		

		
		// TODO: Q10
		// Check to see if the first and second circle from the
		// myCircles array overlap with each other
		// Print "Overlapping" or "Non-overlapping" accordingly. 
		// 
		// Hint: consider using the distance() static method
		 double x1 = myCircles[0].getX();
		 double y1 = myCircles[0].getY();
		 double x2 = myCircles[1].getX();
		 double y2 = myCircles[1].getY();
		 double dist = Circle.distance(x1, y1, x2, y2);
		 double tRad = myCircles[0].getRadius() + myCircles[1].getRadius();
		 if(tRad < dist) {
			 System.out.print("Non-overlapping");
		 }else {
			 System.out.print("Overlapping");
		 }


	}

}
