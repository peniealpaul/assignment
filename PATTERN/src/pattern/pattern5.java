package pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=a;j++) {
				if(i==0||i==10||j==0||j==10)
				System.out.print("* ");
				else {System.out.print("  ");}
			}System.out.println();
		}

	}

}
