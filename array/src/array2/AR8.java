package array2;

public class AR8 {
	static void perfect(int j) {
	int b=0;
	for(int i=1;i<j;i++) {
		if(j%i==0) {
			b=b+i;
		}
	}if(b==j) 
		System.out.println(j);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9,28};
		
		for(int i=0;i<a.length;i++) {
			perfect(a[i]);
		}

	}

}
