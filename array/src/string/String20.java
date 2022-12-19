package string;

public class String20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "  ";
		String b = "i ";
		int count = 0;
		
		char c[] = b.toCharArray();
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) == c[i]) {
						count++;
						c[j] =' ';
						break;
					}
				}}
		}
		else {
			count++;
			}
		
		if (count == b.length()) {
			System.out.println("anagram");
		} else 
			System.out.println("not anagram");
		
	}
}