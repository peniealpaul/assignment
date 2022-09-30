package array;

public class FindingFirstTwoSmallNumbersInAgivenArray {
	int a[] = { 765, 1, 2, 3, 4, 5, 6, 7, 8, 9, 78 };

	void twosmall() {
		int b = a[0];
		for (int k : a) {
			if (k > b) {
				b = k;
			}
		}
		// System.out.println(b);
		int c = b;
		for (int k : a) {
			if ((c > k)) {
				c = k;

			}
		}
		System.out.println(c);
		int d = b;
		for (int k : a) {
			if ((d > k) && (k != c)) {
				d = k;

			}
		}
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindingFirstTwoSmallNumbersInAgivenArray p = new FindingFirstTwoSmallNumbersInAgivenArray();
		p.twosmall();

	}

}
