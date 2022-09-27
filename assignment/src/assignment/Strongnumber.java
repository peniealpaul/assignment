package assignment;

public class Strongnumber {
	public static void main(String arg[]) {
		int c = 0;
		int a = 146;
		int y = a;
		while (a > 0) {
			int k = a % 10;
			a = a / 10;

			int u = 0;

			for (int i = 1; i <= k; i++) {
				int t = 1;
				for (int j = 1; j <= i; j++) {

					t = t * j;
				}

				u = t;

			}
			c = c + u;
		}

		if (y == c)
			System.out.println("STRONG NUMBER");
		else {
			System.out.print("NOT STRONG NUMBER");
		}

	}
}
