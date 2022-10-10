package recpattern;

public class Recpat3 {
	void rec(int a) {
		re(0, 1, a, a - 1);
	}

	void re(int a, int b, int c, int d) {
		System.out.print("  ");
		a++;
		if (a == b) {

			R(0, b, c, d);
		}
		if (a < b) {
			re(a, b, c, d);
		}

	}

	void R(int a, int b, int c, int d) {
		d--;
		System.out.print("* ");
		if (d == 0) {
			System.out.println();
			r(a, b, c, c);
		}
		if (d > 0) {
			R(a, b, c, d);
		}

	}

	void r(int a, int b, int c, int d) {
		b++;
		if (b < c)
			re(a, b, c, c - b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recpat3 S = new Recpat3();
		S.rec(10);

	}

}
