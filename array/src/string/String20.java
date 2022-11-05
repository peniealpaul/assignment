package string;

public class String20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "il";
		String b = "ie";
		int y = 0;
		boolean u = false;
		int l = 0;
		int i = 0;
		if (a.length() == b.length()) {
			while (l < a.length()) {
				y = 0;
				System.out.println(l);
				l++;
				if (u) {
					break;
				}
				// System.out.println();

				for (i = 0; i < a.length(); i++) {
					if (u) {
						break;
					}
					char c = a.charAt(i);
					// System.out.println("h");
					for (int j = 0; j < a.length(); j++) {
						System.out.println("j");
						char d = b.charAt(j);
						if (c == d) {
							u = false;
							y++;
							break;
						} 
					}if(y==0)
						u = true;
				}
				
			}
		}
        System.out.println(l);
		if (l == a.length()) {
			System.out.println("anagram");
		} else
			System.out.println("not");
	}

}
