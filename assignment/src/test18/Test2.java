package test18;

public class Test2 {
	void rev(int a) {
		while(a>0) {
		int b=a%10;
		a=a/10;
		int c=a%10;
		a=a/10;
		System.out.print(c);
		System.out.print(b);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Test2 sc=new Test2();
            sc.rev(456789);
            
	}

}
