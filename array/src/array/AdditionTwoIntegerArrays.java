package array;

public class AdditionTwoIntegerArrays {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int c[] = new int[a.length];

	void add() {
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		for (int k : c) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionTwoIntegerArrays v = new AdditionTwoIntegerArrays();
		v.add();

	}

}
