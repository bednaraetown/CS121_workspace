public class Circle {
	private double x; // x-axis of circle center
	private double y; // y-axis of circle center
	private double radius; // Radius of circle
	
	/**
	 * Constructor
	 * x, y are randomly generated in the range of [-5, 5)
	 * radius is always 1.0 to begin with
	 */
	public Circle() {
		// TODO Q1: finish the constructor
		this.x=(int) (Math.random() * ((-5)-5) + 5);
		this.y=(int) (Math.random() * ((-5)-5) + 5);
		this.radius=1;
		

	}
	
	/**
	 * Calculate the Euclidean Distance between two coordinates 
	 * in a Cartesian Coordinate System. 
	 * @param x1: x-axis of the first coordinate
	 * @param y1: y-axis of the first coordinate
	 * @param x2: x-axis of the second coordinate
	 * @param y2: y-axis of the second coordinate
	 * @return: the calculated Euclidean distance
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		// TODO Q2: Finish the distance()  method
		double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return dist;
		

	}
	
	/**
	 * Calculate the area of the circle
         * area = PI * radius * radius
         * hint: use Math.PI for the value of PI 
	 * @return: returns the calculated area
	 */
	public double area () {
		// TODO Q3: Finish the area() method
		double a = Math.PI * radius *radius;
				return a;
		

	}
	
	/**
	 * Calculate the perimeter of the circle
         * perimeter = 2 * PI * r
         * hint: use Math.PI for the value of PI 
	 * @return: returns the caculated perimeter
	 */
	public double perimeter () {
		// TODO Q4: Finish the perimeter() method
		double p = 2 * Math.PI * radius;
		return p;
		
 
	}
	
	/**
	 * Shift the center of the circle by the given 
	 *     direction and distance
	 * @param direction: which direction to move
	 *        'h': move horizontally;
	 *        'v': move vertically;
	 *        everything else: print "Incorrect direction!"
	 * @param distance: shift the position of the circle by 
	 *        amount of distance
	 */
	public void shift(char direction, double distance) {
		// TODO Q5: Finish the shift() method
		if(direction == 'h') {
			x+=distance;
		} else if(direction == 'v') {
			y+=distance;
		}else {
			System.out.print("Incorrect direction!");
		}
		

	}
	
	/**
	 * Resize the circle by either enlarging or shrinking
	 * @param rate: the multiplier that need to be applied 
	 *        to the radius of the circle. Note that rate
	 *        must be positive, otherwise print error
	 *        message: "Incorrect rate!"
	 */
	public void resize(double rate) {
		// TODO Q6: Finish the resize() method
		if(rate>0) {
			radius = radius*rate;
		}else {
			System.out.print("Incorrect rate!");	
		}
		

	}

	/*** A bunch of getters ***/
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
}