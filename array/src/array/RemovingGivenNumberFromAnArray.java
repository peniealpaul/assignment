package array;

public class RemovingGivenNumberFromAnArray {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b = 3;

	void remove() {
		int n = 0;
		for (int k : a) {
			if (b == k) {
				a[n] = 0;
			}
			n++;
		}
		for (int y : a) {
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingGivenNumberFromAnArray v = new RemovingGivenNumberFromAnArray();
		v.remove();

	}

}
