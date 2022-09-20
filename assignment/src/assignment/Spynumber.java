package assignment;

public class Spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=1;i<100000;i++) {
		int a=i;
		int b=0;
		int c=1;
		while(a>0) {
			int u=a%10;
			a=a/10;
			b=b+u;
			c=c*u;
		}
		
		if(b==c) {
		System.out.println(i);

	}
	}
}}
