
public class lecture8practice {
	
	public static int multi(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}
	
	public static void greeting(String name) {
		System.out.print("Hello, " + name);
	}
	
	public static String reverse(String s) {
		char c0 = s.charAt(0);
		char c1 = s.charAt(1);
		char c2 = s.charAt(2);
		String reverse = "";
		reverse = reverse + c2 + c1 + c0;
		return reverse;
	}
	
	public static void main(String[] args) {
		
		String reverseStr = reverse("Tic");
		System.out.print(reverseStr);
		
	}

}
