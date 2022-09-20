package pattern;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=0;i<a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");}
				for(int k=a-i;k>0;k--) {
					System.out.print(" *");
				}
			System.out.println();

	}

}}
