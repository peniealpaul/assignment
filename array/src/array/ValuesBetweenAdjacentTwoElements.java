package array;

public class ValuesBetweenAdjacentTwoElements {
	int a[] = { 1, 3, 5, 7, 8, 34, 67, 34, 7, 9 };

	void value() {
		for (int i = 0; i < a.length - 1; i++) {
			int c = a[i + 1] - a[i];
			System.out.print(c + ", ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValuesBetweenAdjacentTwoElements v = new ValuesBetweenAdjacentTwoElements();
		v.value();

	}

}
