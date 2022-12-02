
public class primeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 1;
		long startTime, endTime, runTime;
		startTime = System.currentTimeMillis();
		for(int i = 3; i <= 1000000; i++) {
			if(isPrime(i)) {
				cnt++;
			}
			
		}
		
		endTime = System.currentTimeMillis();
		runTime = endTime - startTime;
		System.out.println("Primes found = "+cnt);
		System.out.println("Run Time = "+runTime);
	}
	public static boolean isPrime(int num) {
		if (num == 3) {
			return true;
		}
		if(num%2==0||num%3==0) {
			return false;
			
		}
		for(int i = 3;i< Math.sqrt(num);i+=2) {
			if (num%i==0||num%Math.sqrt(num)==0) {
				return false;
			}
		}
		return true;
	}
	
		
	}


