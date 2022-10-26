package string;

public class String5 {
	public static void main(String[] arg) {
		
	
	String a="abcdefghijklmnoaeioupqrstuvwxyz";
	int count=0;
	for(int i=0;i<a.length();i++) {
		char b=a.charAt(i);
		if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
			count++;
		}
	}System.out.println("the number of vovels in the string   "+count);
	}}


