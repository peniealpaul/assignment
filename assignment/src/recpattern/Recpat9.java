package recpattern;

public class Recpat9 {
void rec(int a) {
	re(0,1,a,1);
}
	void re(int a,int b,int c,int d){
		System.out.print(d+" ");
		d++;
		a++;
		if(a==b) {
			r(a,b,c,d);
		}if(a<b) {
			re(a,b,c,d);
		}
	}
	void r(int a,int b,int c,int d) {
		System.out.println();
		b++;
		if(b<c) {
			re(0,b,c,d);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Recpat9 c=new  Recpat9 ();
		 c.rec(5);
	}

}
