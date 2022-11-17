package test18;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=200;i++) {
			int b=i%50;
			int c=i%100;
			if(i%5==0&&i%10!=0) {
				System.out.println(i);
			}
			
			else if(b<10&&c>10) {
				System.out.println(i);
			}
		}

	}

}
