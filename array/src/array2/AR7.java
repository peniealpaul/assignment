package array2;

public class AR7 {
	static void prime(int a) {
        int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
                break;
				}
		}
		if (count == 0)
			System.out.println(a);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			prime(a[i]);
		}

	}

}
