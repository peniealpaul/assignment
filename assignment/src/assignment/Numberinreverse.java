package assignment;

public class Numberinreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int b=0;
		while(a>0) {
			b=a%10;
			System.out.print(b);
			a=a/10;
		}

	}

}
