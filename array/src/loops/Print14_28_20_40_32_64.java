package loops;

public class Print14_28_20_40_32_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14;
		int b=8;
		int c=1;
		while (c<=10) {
			System.out.println(a);
			if(c%2!=0) {
				a=a+a;
				c=c+1;
			}else {
				a=a-b;
				c=c+1;
			}
		}
		}}
