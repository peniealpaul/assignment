package array;

public class FindingSmallestNoInGivenArray {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 9 };

	void small() {
		int b = 0;
		for (int k : a) {
			if (b < k) {
				b = k;
			}
		}
		for (int k : a) {
			if (k < b) {
				b = k;

			}
		}
		System.out.print("Small no is " + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingSmallestNoInGivenArray v = new FindingSmallestNoInGivenArray();
		v.small();

	}

}
