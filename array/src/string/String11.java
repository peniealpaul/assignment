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
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//if(a==b)
			//if(a=="121")
			//if(b=="121")	
	if(a.equals(b))
System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	}

