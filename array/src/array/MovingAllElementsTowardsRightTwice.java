package array;

public class MovingAllElementsTowardsRightTwice {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	void RightTwice() {
		for(int j=0;j<2;j++) {
		int b = a[a.length-1];
		for (int i = a.length-1; i >= 1; i--) {
			a[i] = a[i-1 ];
		}
		a[0] = b;
		
		}for (int k : a) {
			System.out.print(k + " ");
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingAllElementsTowardsRightTwice v = 
				new MovingAllElementsTowardsRightTwice();
		v.RightTwice();
	}


}



