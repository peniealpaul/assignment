package recpattern;

public class Recpat8 {
	void rec(int a) {
		a=a%2==0?a+1:a;
		re((a/2)+1,a,(a/2)+1);
	}
	void re(int a,int b,int c) {
	if()
		System.out.print("* ");
	else
		System.out.print(" ");
		a--;
		if(a==0) {
			System.out.println();
			r(a,b,c);
		}if(a>0) {
			re(a,b,c);
		}
		
	}
	void r(int a,int b,int c) {
		b--;
		if(b>0) {
			re(c,b,c);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recpat8 b=new Recpat8 ();
		b.rec(11);
	}

}
