package array2;

public class AR10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {1,0,2,3,4,7,5,6,7,8,9,28};
			for(int i=0;i<a.length;i++) {
				if(i%2!=0&&a[i]%2==0) {
					System.out.println(a[i]);
				}
			}

	}

}
