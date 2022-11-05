package loops;

public class Print80_10_70_15_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 80;
		int b = 10;
		int c = 10;
		int d = 5;
		int e = 1;
		while (e <= 10) {
			if (e % 2 != 0) {
				System.out.println(a);
				a = a - c;
				e = e + 1;
			} else {
				System.out.println(b);
				b = b + d;
				e = e + 1;
			}
		}
	}
}
