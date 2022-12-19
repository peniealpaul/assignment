package test18;
public class Test9 {
	void fprime(int a) {
        int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
                break;
				}
		}
		if (count == 0)
			System.out.println(a);}
        void fib(int a) {
		int b = 1;
		int c = 1;
		int d = 0;
		while (b < a) {
			// System.out.println("oo"+b);
			fprime(b);
			d = c + b;
			b = c;
			c = d;
             }
            }
          public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 sc = new Test9();
		sc.fib(10000000);
          }

}
