package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=1;i<a;i++) {
		int	b=i<(a/2)?a-i:i;
		
			for(int j=b;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=a-b;k>0;k--)if(i==1||i==9) {
				System.out.print("  ");
			}
				
				
			else if(k==1||k==a-b) {
				System.out.print("*  ");
			}else {System.out.print("    ");}
			
			
			
		System .out.println();}

	}

}