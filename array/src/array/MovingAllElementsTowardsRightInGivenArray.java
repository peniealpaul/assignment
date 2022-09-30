package array;

public class MovingAllElementsTowardsRightInGivenArray {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		void Right() {
			int b = a[a.length-1];
			for (int i = a.length-1; i >= 1; i--) {
				a[i] = a[i-1 ];
			}
			a[0] = b;
			for (int k : a) {
				System.out.print(k + " ");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MovingAllElementsTowardsRightInGivenArray v = 
					new MovingAllElementsTowardsRightInGivenArray();
			v.Right();
		}


}
