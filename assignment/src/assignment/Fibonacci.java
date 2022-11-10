package assignment;

public class Fibonacci {
	public static void main(String[] args) {
		
		int f = 0;
		
		int t = 1;
		
		int n = 0;
		
		for (int i = 0; i < 10; i++) {
			n = f + t;
			System.out.println(f);
			
			f = t;
			
			t = n;
			
			
			
		}
	}
}