package assignment;

public class Fibonacci {
	public static void main(String[] args) {
		
		int f = 0;
		
		int t = 1;
		
		int n = 1;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(f);
			
			f = t;
			
			t = n;
			
			n = f + t;
			
		}
	}
}