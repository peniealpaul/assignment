package test18;

public class Test3 {
	int pow(int a,int b) {
		int c=a;
		for(int i=1;i<b;i++) {
			c=c*a;
		}
		return c;
	}
	void twopow(int a) {
		for(int i=a;i>0;i--) {
			int d=pow(2,i);
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test3 sc=new Test3();
          sc.twopow(5);
	}

}
