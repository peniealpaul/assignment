package loops;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 13;
		int div = 2;
		int count =0;
		while (div < no) {
			if (no % div == 0) {
				count++;
			}
			div = div + 1;
		}if(count==0) {
			System.out.println("prime no");
		}else
			System.out.println("not prime no");

	}

}
