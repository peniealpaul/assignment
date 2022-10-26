package string;

public class String7 {
	void count(String a) {
		int count = 0;
		int coun = 0;
		int i = 0;
		for (i = 0; i < a.length(); i++) {
			count = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
			coun = 0;
			for (int t = 0; t < i; t++) {
				if (a.charAt(i) == a.charAt(t)) {
					coun++;
				}
			}
			if (coun == 0)
				System.out.println(a.charAt(i) + " = "+ count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "paulpenieal";
		String7 s = new String7();
		s.count(a);
	}
}
