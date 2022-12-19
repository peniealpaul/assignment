package array2;

public class AR6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		int j=0;
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		int odd[]=new int[a.length-count];
	    int even[]=new int[count];
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]%2==0) {
	    		
	    		even[j]=a[i];
	    		j++;
	    	}else {
	    		odd[k]=a[i];
	    	k++;} }
	    System.out.println("the odd array");
	    for(int i=0;i<odd.length;i++) {
	    	System.out.print(odd[i]+"  ");
}System.out.println();
    System.out.println("the even array");
    for(int i=0;i<even.length;i++) {
    	System.out.print(even[i]+"  ");
}

}}
