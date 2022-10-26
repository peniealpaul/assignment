package assignment;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1000000000;
		int b = 0;
		int c = 0;
		int i = 1;
		int d = 0;

		while (a > 0) {
			boolean t = false;
			c = 0;
			if (a % 2 == 1) {
				t = true;
				c = 1;
				c = (c * i);
				d = c;

			}
			i = i + i;
			a = a / 10;
			if (t)
				b = b + (d);
		}
		System.out.print(b);
	}

}
