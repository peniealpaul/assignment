package loops;

public class Print8_6_9_23_87_429 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 2;
		int c = 1;
		while (c <= 10) {
			System.out.println(a);
			a = (a * c) - b;
			c = c + 1;
			b = b + 1;

		}
	}

}
