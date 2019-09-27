
public class PowerOfTwo {

	public static void main(String[] args) {
		
		Boolean isPowerOfTwo = powerOfTwo(1024);
		System.out.println(isPowerOfTwo);
	}
	
	public static boolean powerOfTwo(int n) {
		
		long i=1;
		
		while(i<n) {
			i *= 2;
		}
		
		return i == n;
	}
}
