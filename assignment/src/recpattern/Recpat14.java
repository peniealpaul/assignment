package recpattern;

public class Recpat14 {
	void rec(int a) {
		re(0,1,a,0,1);
	}
		void re(int a,int b,int c,int d,int e){
			d=d+e;
			System.out.print(d+" ");
			e=d-e;
			a++;
			if(a==b) {
				r(a,b,c,d,e);
			}if(a<b) {
				re(a,b,c,d,e);
			}
		}
		void r(int a,int b,int c,int d,int e) {
			System.out.println();
			b++;
			if(b<c) {
				re(0,b,c,d,e);
			}
		}
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Recpat14 c=new  Recpat14 ();
			 c.rec(5);
		}

	}



