package array2;

public class AR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {  5, 4, 3, 2, 3,9, 4, 1, 2, 6, 7, 5 };
		boolean b = true;
		int i = 0;
		int j = 0;
		int count = 0;
		for (i = 0; i < a.length ; i++) {
			count = 0;
			for (j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println(a[i]);
				//b = false;
				break;

			}
		}
	}
}
