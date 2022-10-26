package recpattern;

public class Recpat6 {
	void rec(int a) {
		re(a, a, a);
     }
void re(int a, int b, int c){
		if (a==b)
			System.out.print("* ");
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recpat6 c = new Recpat6();
		c.rec(15);
	}

}
