package array;

public class LinearSearch {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b = 11;

	void linear() {
		int n = 0;
		for (int s : a) {
			if (s == b) {
				n++;
			}
		}
		if (n > 0) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch v = new LinearSearch();
		v.linear();

	}

}
