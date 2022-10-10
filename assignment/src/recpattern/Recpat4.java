package recpattern;

public class Recpat4 {
	void Rec(int a){
		re(a,0,a);
	}
	void re(int a,int b,int c) {
		if(a<=b)
		System.out.print("* ");
		else
		System.out.print("  ");
		a--;
		if(a==0) {
			r(a,b,c);}
			if(a>0) {
				re(a,b,c);
			}
		}void r(int a,int b,int c){
			b++;
			System.out.println();
			if(b<c) {
				re(c,b,c);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recpat4 s=new Recpat4();
		s.Rec(10);
	}

}
