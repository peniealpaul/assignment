package recpattern;

public class Recpat8 {
	void rec(int a) {

		re(a, a, a);
		Re(a, a, a);
	}

	void re(int a, int b, int c) {
		if (a + b <= c + 1)
			System.out.print("  * ");
		else
			System.out.print("  ");
		a--;
		if (a == 0) {
			System.out.println();
			r(a, b, c);
		}
		if (a > 0) {
			re(a, b, c);
		}

	}

	void r(int a, int b, int c) {
		b--;
		if (b > 0) {
			re(c, b, c);
		}
	}

	void Re(int a, int b, int c) {
		if ((a - b <= 0) && (b != c))
			System.out.print("  * ");
		else if (b != c)
			System.out.print("  ");
		a--;
		if (a == 0) {
			if (b != c)
				System.out.println();
			R(a, b, c);
		}
		if (a > 0) {
			Re(a, b, c);
		}

	}

	void R(int a, int b, int c) {
		b--;
		if (b > 0) {
			Re(c, b, c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recpat8 b = new Recpat8();
		b.rec(6);
	}

}
