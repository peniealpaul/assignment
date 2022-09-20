package pattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=0;i<a;i++) {
			for(int j=a-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System .out.println();
		}

	}

}
