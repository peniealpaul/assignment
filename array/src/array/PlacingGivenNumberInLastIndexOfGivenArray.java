package array;

public class PlacingGivenNumberInLastIndexOfGivenArray {

	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b = 234;

	void place() {
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				a[i] = b;
			}
		}
		for (int k : a) {
			System.out.println(k);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlacingGivenNumberInLastIndexOfGivenArray v = new PlacingGivenNumberInLastIndexOfGivenArray();
		v.place();
	}

}
