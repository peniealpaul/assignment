package array;

public class CopyingOnlyTheNegativeNumbers {
	int a[] = { 1, 2, -3, -4, 5, 6, -7, -8, 9 };
	int b[];
	int n = 0;

	void copynegative() {

		for (int k : a) {
			if (k < 0) {
				n++;
			}
		}
		b = new int[n];
		int y = 0;
		for (int k : a) {
			if (k < 0) {
				b[y] = k;
				y++;
			}

		}
		for (int k : b) {
			System.out.print(k + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyingOnlyTheNegativeNumbers v = new CopyingOnlyTheNegativeNumbers();
		v.copynegative();

	}

}
