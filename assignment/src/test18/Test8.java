package test18;

public class Test8 {
	void print(int a) {
        int b = a % 8;
		a = a / 8;
		if (a > 0) {
			print(a);
		}
		System.out.print(b);
	}
  void octel(int a) {
		int count = 1;
		int c = 0;
		while (a > 0) {
			int b = a % 2;
			if (b == 1) {
				c = c + count;
			}
			count *= 2;
			a = a / 10;
            }
		System.out.println("dicimal  =" + c);
		System.out.print("octel    =");
		print(c);
       }
       public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 sc = new Test8();
		sc.octel(100000);
	}

}
