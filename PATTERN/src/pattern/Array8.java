package pattern;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		int a[]=new int[1];
		
		for(int i =a.length;i<116;i++)
		{
			
		a=new int[i];
		a[b]=9;
	b++;
	

	}for (int k:a) {
		System.out.println(k);
	}

}
}