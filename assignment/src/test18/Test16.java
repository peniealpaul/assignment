package test18;

public class Test16 {
	static void fact(int a) {
		int b = 1;
		for (int i = 2; i <= a; i++) {
			b = b * i;
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int a = 2;
		int i = 0;

		while (a <= 10) {
			count = 0;
			for (i = 2; i < a; i++) {
				if (a % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("     ");
				fact(i);

			}
			a++;

		}
	}
}
