package assignment;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10000;
		for(int j=1;j<a;j++) {
		int b=0;
		for(int i=1;i<j;i++) {
			if(j%i==0) {
				b=b+i;
			}
		}if(b==j) 
			System.out.println(j);
		//else {
			//System.out.print("NOT A PERFECT NUMBER");
		//}
		}
	}

}
