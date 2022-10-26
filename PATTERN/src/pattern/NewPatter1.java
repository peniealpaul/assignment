package pattern;

public class NewPatter1 {

	public static void main(String[] args) {
		int n=10;
		int i=0;
		int j=0;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=n;j++) {
				if(j==i||j==n)
				System.out.print(" *");
				else {
					System.out.print("  ");
				}
			
			}System.out.println();
		}

	}

}
