package assignment;

public class Neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=1;i<10000;i++) {
	int b=i*i;
	int c=i;
	int d=0;
	int e=0;
	while(b>0) {
		d=b%10;
	
		b=b/10;
		e=e+d;
	
	}
if(e==c) {
	System.out.println("neon number   "+i);
}//else System.out.print("not neon number");
}
	}
}

