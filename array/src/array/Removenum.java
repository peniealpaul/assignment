package array;

public class Removenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 9, 4, 9, 6, 5, 8, 9, 10,5,8, 11, 12, 13 };
		int b = 11;
		int n=0;
		for (int k : a) {

			if (k == b) {
				a[n] = 0;
			}n++;
		}
		for (int k : a) {
			System.out.println(k);
		}

	}

}
