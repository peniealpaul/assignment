package array;

public class CopyInReverse {
	
	

	void reverse(int a[]) {
		int b[] = new int[a.length];
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
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		v.reverse(a);

	}

}
