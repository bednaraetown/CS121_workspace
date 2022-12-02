
public class Rectangle {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	//constructor
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	//getter
	public double getWidth() {
		return (x2-x1);
	}
	
	public double getHeight() {
		return (y1-y2);
	}
	
	public double area() {
		return getWidth()*getHeight();
	}
}
