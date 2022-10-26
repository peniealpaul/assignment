package string;

public class String6 {
	
	void count(String a) {
		for(int i=0 ;i<a.length();i++) {
			char b=a.charAt(i);
			if(b>=48&&b<=57) {
				System.out.println(b);
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String6 n=new String6();
		String a="abcde3456390";
		n.count(a);

	}

}
