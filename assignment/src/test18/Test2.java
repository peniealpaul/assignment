package test18;

public class Test2 {
	void rev(int a) {
		while(a>0) {
		int b=a%100;
		a=a/100;
		System.out.print(b);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Test2 sc=new Test2();
            sc.rev(456789);
            
	}

}
