
public class lecture9practice {
	
	public static double euclideanDistance(double x1, double x2, double y1, double y2) {
		
	
	double multx = x1-x2;
	double multy = y1-y2;
	double resx = Math.pow(multx, 2);
	double resy = Math.pow(multy, 2);
	double multBoth = resx*resy;
	double answ = Math.sqrt(multBoth);
	return answ;
	
	
		
		
	}
	public static void main(String[] args) {
		
		double distance = euclideanDistance(2, 4, 6, 8);
		System.out.printf("%.2f", distance);

	}

}
