package string;

public class String9 {
	int count1=0;
	void count(String a,int b,char c) {
		b--;
		if(a.charAt(b)==c) {
			
			count1++;}
		if(b>0) {
			
			
			count(a,b,c);
		}if(b==0)
		System.out.println(count1);
	}
	public static void main(String... paul) {
		// TODO Auto-generated method stub
String9 d=new String9();
String a="paulpenieal";
char g='l';
int b=a.length()-1;
    d.count(a,b,g);
    

	}

}
