package array;

public class RemovingAllTheDuplicateElements {
	public static void main(String[] args) {
		int a[] = { 1, 3,3,6,4,4,6};
		         //{ 1, 3,0,6,4,0,0};
		
		int b[] = new int[a.length];

		for (int k = 0; k < a.length; k++) {
			b[k] = a[k];
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int y = i+1; y < b.length; y++) {
				if ((a[i] == b[y])  ) {
					b[y] = 0;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0)
				System.out.print(b[i] + ", ");
		}
	}
}
