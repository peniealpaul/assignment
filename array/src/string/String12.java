package string;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="paul";
		char b[]=new char[a.length()];
		for(int i=0;i<b.length;i++) {
			b[i]=a.charAt(i);
			
		}
for(char k:b) {
	System.out.println(k);
}}}
