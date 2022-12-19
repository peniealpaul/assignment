package assignment;

public class Prime20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int key=5;
		int y=1;
		for (int a = 2; k<key; a++) {
			
			
			boolean b = true;
			
			
			
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					b = false;
					}
				}
			if (b) {
				k++;
				y=y*a;
			}
		}System.out.println(y);
	}
}
