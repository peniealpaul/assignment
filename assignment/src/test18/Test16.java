package test18;

public class Test16 {
	static boolean fact(int a) {
		int b=1;
		boolean c=false;
		for(int i=2;i<=a;i++) {
			 b=b*i;
		}if(b<10) {
			c=true;
		System.out.println(b);}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int a=2;
		int i=0;
		boolean v=true;
		while(v) {
			count =0;
		for ( i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
                break;
				}
		}
		if (count == 0)
			v=fact(i);
		a++;
         }

	}}


