package assignment;

public class Prime20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 2; a < 21; a++) {
		boolean b = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = false;
			}
		}
		if (b) {
			System.out.println(a);
		

		}

	}
	
		
		

	}}
