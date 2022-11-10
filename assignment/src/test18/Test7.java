package test18;

public class Test7 {
	void no2(int b) {
		
		int a = 1;
		for (int i = b; i >= 1; i--) {
			a = 1;

			for (int j = 1; j < i; j++) {
				a = a * i;
			}
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Test7 sc = new Test7();
		
		sc.no2(5);

	

	}

}
