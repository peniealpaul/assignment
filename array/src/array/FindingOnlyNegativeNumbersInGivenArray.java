package array;

public class FindingOnlyNegativeNumbersInGivenArray {
	int a[] = { 1, -2, -3, 4, 5, -6, -7, 8, 9 };

	void negative() {
		for (int k : a) {
			if (k < 0) {
				System.out.print(k + " ");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingOnlyNegativeNumbersInGivenArray v = new FindingOnlyNegativeNumbersInGivenArray();
		v.negative();

	}

}
