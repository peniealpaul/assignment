package test18;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		int c = 0;
		while (b <= 20) {
			int count = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				c = c + a;

				b++;
			}
			a++;

		}
		System.out.println(c);

	}

}
