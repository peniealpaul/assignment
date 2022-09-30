package array;

public class MovingAllElementsTowardsLeftInTwice {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	void leftTwice() {

		for (int j = 0; j < 2; j++) {

			int b = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = b;

		}
		for (int k : a) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingAllElementsTowardsLeftInTwice v = new 
				MovingAllElementsTowardsLeftInTwice();
		v.leftTwice();
	}

}
