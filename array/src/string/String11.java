package string;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="121";
		String b="";
		char c;
		for(int i=0;i<a.length();i++) {
			c=a.charAt(i);
			b=c+b;
		}
		
		
		if(a.equals(b))
System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	}

