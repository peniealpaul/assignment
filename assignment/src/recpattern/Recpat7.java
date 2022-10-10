package recpattern;

public class Recpat7 {
	void rec(int a) {
		re(a,0,a);
	}
	void re(int a, int b, int c) {
		if(a==b)
		System.out.print(" *");
		else
			System.out.print("  ");
		a--;
		if(a==0) {
			r(a,b,c);
		}if(a>0) {
			re(a,b,c);
		}
	}void r(int a, int b ,int c){
		System.out.println();
		b++;
		if(b<=c) {
			re(c,b,c);
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Recpat7 c=new  Recpat7 ();
		 c.rec(10);

	}

}
