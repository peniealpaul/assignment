package test18;
public class Test4 {
	void swap(int a,int b,int c,int d) {
		System.out.println("BEFORE SWAP");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);
		a=a+b;
		b=a-b;
		a=a-b;
		b=b+c;
		c=b-c;
		b=b-c;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("AFTER SWAP");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);}
public static void main(String[] args) {
		Test4 sc=new Test4();
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		sc.swap(a, b, c, d);}}
