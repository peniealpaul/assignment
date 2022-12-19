package string;


public class Main {

	public static void main(String[] args) {
		String name="jegatheesh";
		int a=name.length();
		String capsName;
		for(int i=0;i<a;i++)
		{
			char ch=name.charAt(i);
			capsName =""+(char)(ch-32);
			System.out.print(capsName);
		}
		
	}

}
