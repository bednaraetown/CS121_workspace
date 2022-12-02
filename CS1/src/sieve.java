
public class sieve {

	public static void main(String[] args) {
		boolean[] prime = new boolean [1000000000];
		int n,i,count=0;
		
		long startTime, endTime, runTime;
		startTime = System.currentTimeMillis();
		for (i=0;i<prime.length; i++) {
			
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		
		for (n=2; n<prime.length; n++) {
			if (prime[n]) {
				count++;
				for (i=n*2; i<prime.length; i+=n)
					prime[i] = false;
			}
		}
		endTime = System.currentTimeMillis();
		runTime = endTime - startTime;
		System.out.println("Primes found = "+count);
		System.out.println("Run Time = "+runTime);
	}

}
