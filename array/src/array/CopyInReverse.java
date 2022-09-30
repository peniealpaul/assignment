package array;

public class CopyInReverse {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b[] = new int[a.length];

	void reverse() {
		int n = a.length - 1;
		for (int k : a) {
			b[n] = k;
			n--;
		}
		for (int k : b) {
			System.out.print(k + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyInReverse v = new CopyInReverse();
		v.reverse();

	}

}
