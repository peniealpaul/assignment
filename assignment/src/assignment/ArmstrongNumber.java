package assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u=10000;
		for(int o=1;o<u;o++) {
		int a=o;
		int t=a;
		int g=t;
		int n=0;
		int b=1;
		int c=0;
		int k=0;
		while(a>0) {
		a= a/10;
		n++;
		
			
			
		}
		//System.out.println(n);
		while(t>0) {
			k=t%10;
			b=k;
			for(int i=1;i<n;i++) {
				//System.out.println();
			
			b=b*k;}
			t=t/10;
			c=c+b;
			//System.out.println();
			//System.out.println();
			
		}
		if(c==g) {
			
			System.out.println(c);
			
		}//else {
			//System.out.println("not Armstrong");
		}
		
		
		}}
