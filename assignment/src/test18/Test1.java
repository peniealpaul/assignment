package test18;

public class Test1 {
	void div(int a) {
		for(int b=2;b<a;b++) {
			if(a%b==0) {
				prime(b);
			}
		}
	}
	void prime(int a) {
		int count=0;
		for(int i=2;i<a;i++) {
		if(a%i==0) {
			count++;
		}}if(count==0) {
			System.out.println(a);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 sc=new Test1();
		sc.div(100);

	}

}
