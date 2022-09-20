package assignment;

public class Reverseanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int b=0;
		int c=0;
		while(a>0) {
			b=a%10;
			a=a/10;
			c=((c*10)+b);}
			System.out.print(c);
	

}
}