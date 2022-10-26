package array;

public class RecArrayPrint {
	
void Array(int a[],int b,int i) {
	
	System.out.println(a[i]);
	i++;
	if(i<b) {
		Array(a,b,i);
	}
	
	
}

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecArrayPrint d= new RecArrayPrint();
		int a[]= {1,2,3,4,5,6};
		d.Array(a,a.length,0);
		
		
		
		
		

	}

}
