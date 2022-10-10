package recpattern;

public class Dimond {
	void d(int a) {
		int e = a % 2 == 0 ? a / 2 : (a / 2) + 1;
		di(a, a, a, a, e, a);
	}

	void di(int a, int b, int c, int d, int e, int f) {
		e--;
		System.out.print(" ");
		if (e == 0) {
			f = b > c / 2 ? c - (b - 1) : b;
			b--;
			dim(f, b, c, d, e, f);
		}
		if (e > 0) {
			di(a, b, c, d, e, f);
		}
	}

	void dia(int a, int b, int c, int d, int e, int f) {
		System.out.println();
		if (b > 0) {
			di(e, b, c, d, e, f);
		}
	}

	void dim(int a, int b, int c, int d, int e, int f) {
		a--;
		if ((a + 1 == f) || (a == 0))
			System.out.print(" *");
		else
			System.out.print("  ");
		e = b > c / 2 ? b - (c / 2) : (c - (b - 1)) - (c / 2);
		if (a == 0)
			dia(a, b, c, d, e, f);
		if (a > 0)
			dim(a, b, c, d, e, f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimond sc = new Dimond();
		sc.d(13);
	}
}
