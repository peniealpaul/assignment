package recpattern;

public class Recpat1 {
	void rec(int a) {
		re(0,1,a);
	}
	
	void re(int a,int b,int c) {
		System.out.print("* ");
		a++;
		if(a==b) {
			System.out.println();
			r(0,b,c);
		}
		if(a<b) {
			re(a,b,c);
		}
		
		
	}
	void r(int a,int b,int c) {
		b++;
		if(b<c)
		re(a,b,c);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Recpat1 S= new Recpat1();
		S.rec(10);
		
		
		
		
	}

}
