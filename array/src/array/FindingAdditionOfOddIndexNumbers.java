package array;

public class FindingAdditionOfOddIndexNumbers {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 1 };

	void oddadd() {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				b = b + a[i];
			}

		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingAdditionOfOddIndexNumbers p = new FindingAdditionOfOddIndexNumbers();
		p.oddadd();

	}

}
