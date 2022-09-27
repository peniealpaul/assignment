package array;

public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = new int[a.length];
		for (int j = 0; j < a.length; j++)
			b[(a.length - 1) - j] = a[j];

		for (int j = 0; j < a.length; j++)
			a[(j)] = b[j];

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
