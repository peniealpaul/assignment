package array;

public class HowManyTimesGivenElementIsPresent {
	int a[] = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9 };
	int b = 6;

	void present() {
		int n = 0;
		for (int k : a) {
			if (b == k) {
				n++;
			}

		}
		System.out.println(n+" times");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowManyTimesGivenElementIsPresent v = new HowManyTimesGivenElementIsPresent();
		v.present();

	}

}
