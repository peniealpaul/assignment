package string;

public class String19 {
	String19(){
		System.out.println(" hello");
	}
	String19(int a){
		this();
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String19 sc=new String19(5);
		
		String a="PaUl";
		String v="";
	
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			char c=b;
			if(b>='A'&&b<='Z') {
			 c=Character.toLowerCase(b); 
			}
			if(b>='a'&&b<='z') {
				 c=Character.toUpperCase(b); 
				}
			v=v+c;
		}
		System.out.println(v);

	}

}
