package pattern;

public class NewPattern {

	public static void main(String[] args) {
		int n=3;
		int i=0;
		int j=0;
		for(i=0;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				if(j==0||j==i)
				System.out.print(" *");
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
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

