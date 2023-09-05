
/**
 * @author Garrick Mata
 * @version 1.0
 * 
 */

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		
		
		System.out.println("The " + n+ "th number in the fibonacci sequence is: " + fibSequnece(n));
		

	}

	/**
	 * Takes parameter n and returns the nth number in the Fibonacci sequence	
	 * @param n
	 * @return
	 */
	
	private static long fibSequnece(int n) {
		if (n <= 1) {
			return n;
		}
		
		return( fibSequnece(n -1) + fibSequnece(n-2));
	}

}
