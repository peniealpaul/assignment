package test18;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=85;
		boolean b=true;
		int c=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				c=i;
				if(b)
				System.out.println("SMALL DIV  "+i);
				b=false;
			}}
			System.out.println("BIG DIV  "+c);
		}

	}


