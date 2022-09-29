package array;

public class Countofduplicate {

	int a[] = { 1, 2, 1, 3, 4, 5, 6, 6, 6, 8, 9, 9, 7, 8, 9, 10 };
	int b[] = new int[a.length];

	void count() {
		int z = 0;
		for (int y : a) {
			b[z] = y;
			z++;
		}

		for (int k : a) {
			int n = 0;
			int g = 0;
			for (int h : b) {

				if (k == h) {
					b[g] = 0;
					n++;
				}
				g++;
			}
			if (n > 1)
				System.out.println(k + "=" + n);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countofduplicate p = new Countofduplicate();
		p.count();

	}

}
