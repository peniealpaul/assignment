package array;

public class FindingFirstTwoBiggestNumbersInAgivenArray {
	int a[] = { 765, 1, 2, 3, 4, 5, 6, 7, 8, 0, 9, 78 };

	void twobig() {
		int b = 0;
		for (int k : a) {
			if (b < k) {
				b = k;
			}
		}
		System.out.println(b);
		int c = 0;
		for (int k : a) {
			if ((c < k) && (k != b)) {
				c = k;

			}
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingFirstTwoBiggestNumbersInAgivenArray p = new FindingFirstTwoBiggestNumbersInAgivenArray();
		p.twobig();

	}

}
