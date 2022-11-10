package test18;

public class Test5 {
	void FACTCALL(int a) {
		while(a>0) {
			fact(a);
			a--;
		}
	}
	void fact(int a) {
		int b=1;
		for(int i=2;i<=a;i++) {
			 b=b*i;
		}System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test5 sc=new  Test5();
		 sc.FACTCALL(5);

	}

}
