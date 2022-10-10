package recpattern;

public class TRIangle {
	void tri(int a) {
		tr(a, a, a, a - a);
	}

	void tr(int a, int b, int c, int d) {
		System.out.print(" ");
		a--;
		if (a == 0) {
			d++;
			T(b-b, b, c, d);
		}
		if (a > 0)
			tr(a, b, c, d);
	}

	void T(int a, int b, int c, int d) {
		a++;
		if(a==1||a==d||b==1)
		System.out.print(" *");
		else
			System.out.print("  ");
		if (a == d) {
			System.out.println();
			t(a, b, c, d);
		} else
			T(a, b, c, d);
	}

	void t(int a, int b, int c, int d) {
		b--;
		if (b > 0) {
			tr(b, b, c, d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TRIangle sc = new TRIangle();
		sc.tri(7);
	}
}
