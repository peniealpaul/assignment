package assignment;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 1;
		int n = 0;
		for (int i = 0; i < 20; i++) {

			f = f + n;
			System.out.println(n);
			n = f - n;
		}

	}

}
