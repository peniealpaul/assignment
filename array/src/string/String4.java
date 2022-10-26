package string;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="abcdefaudaaaaddhgdhnfg";
		 
		char f='a';
		int count=0;
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b==f) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		

	}

}
