package array;

public class CopyingOnlyTheOddIndexedNumbers {

	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b[] = new int[a.length / 2];

	void copyoddindex() {
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				b[y] = a[i];
				y++;
			}
		}
		for (int k : b) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyingOnlyTheOddIndexedNumbers v = new CopyingOnlyTheOddIndexedNumbers();
		v.copyoddindex();

	}

}
