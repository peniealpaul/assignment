package no;

public class Numofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int b=0;
		while(a>0) {
			a=a/10;
			b++;
		}
		System.out.print("the number of digit is ="+b);

	}

}
