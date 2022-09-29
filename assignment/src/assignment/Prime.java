package assignment;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1597;
		boolean b = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = false;
			}
		}
		if (b) {
			System.out.print("PRIME NUMBER");
		}
		if (!b) {
			System.out.print("NOT PRIME ");

		}
	}
}
/*
 * int k = 11; int c = 0; for (int a = 2; a < k; a++) { if (k % a == 0) c++;
 * 
 * } if (c > 0) { System.out.print("NOT PRIME"); } else {
 * System.out.print("PRIME"); }
 */
}

}
