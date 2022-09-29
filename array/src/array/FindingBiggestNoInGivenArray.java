package array;

public class FindingBiggestNoInGivenArray {
	int a[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	void big() {
		int b = 0;
		for (int k : a) {
			if (b < k) {
				b = k;
			}
		}
		System.out.println("BIG NO IS " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingBiggestNoInGivenArray v = new FindingBiggestNoInGivenArray();
		v.big();

	}

}
