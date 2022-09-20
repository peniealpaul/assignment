package assignment;

public class Greatcominttwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000100;
		int b = 1000000100;
		int c = 0;
		int d = 0;
		
		boolean t = true;
		for (int i = b; i >=1; i--) {

			if ((b % i == 0) && (t)) {
				c = i;

				for (int j = a; j >=1; j--) {
					if (a % j == 0) {
						d = j;
						if (d == c) {
							System.out.println(j);
							t = false;
							break;
						}
					}
				}
			}

		}
	}
}
