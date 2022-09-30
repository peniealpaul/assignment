package array;

public class RemovingAllTheDuplicateElements {
	int a[] = { 1, 2, 3, 9, 4, 4, 5, 5, 5, 6, 6, 7, 8, 9, 9 };
	int b[] = new int[a.length];

	void duplicate() {
		int n = 0;
		for (int k : a) {
			b[n] = k;
			n++;

		}
		for (int i = 0; i < a.length; i++) {
			for (int y = 0; y < b.length; y++) {
				if ((a[i] == b[y]) && (i != y) && (i < y)) {
					b[y] = 0;
				}
			}
		}
		for (int u : b) {
			if(u!=0)
			System.out.print(u + ", ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingAllTheDuplicateElements v = new RemovingAllTheDuplicateElements();
		v.duplicate();

	}

}
