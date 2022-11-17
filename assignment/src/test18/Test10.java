package test18;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		while(a<100) {
		 int count = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					count++;
	                break;
					}
			}
			if (count == 0)
				System.out.println(a);
	         
		a++;
		
		}

	}

}
