package string;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="paulpenieal";
		String b="";
		char c;
		for(int i=0;i<a.length();i++) {
			c=a.charAt(i);
			b=c+b;
		}
System.out.println(b);
	}

}
