package array;

public class FindingIndexOfGivenNumber {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int b = 7;

	void index() {
		int n = 0;
		for (int k : a) {

			if (b == k) {
				System.out.print("THE INDEX OF GIVEN NUM IS = " + n);

			}
			n++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingIndexOfGivenNumber h = new FindingIndexOfGivenNumber();
		h.index();

	}

}
