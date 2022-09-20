package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(i==0||i==10) {
				 b=i<a/2?j:a-j;
				System.out.print(b+" ");}
				else if(j==0||j==10) {
					b=j<a/2?i:a-i;
					System.out.print( b+"  ");}
				else {System.out.print("  ");}
			}System.out.println();
		}

	}

}
