package assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		int r=a;
		int b=0;
		int c=0;
		while(a>0) {
			b=a%10;
			a=a/10;
			c=((c*10)+b);}
			if(r==c) {
				System.out.print("palindrome");
			}else {
				System.out.print("not palindrome");
			}
	

	}

}
