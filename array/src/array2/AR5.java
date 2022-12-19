package array2;

public class AR5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {5,2,3,7,10,1,0,6,4};
	      for(int i=0;i<ar.length;i++) {
	    	  for(int j=i+1;j<ar.length;j++) {
	    		  if(ar[i]*ar[j]==20) {
	System.out.println(ar[i]+" * "+ar[j]+" = 20");
	    		  }
	    	  }
	      }

	}

}
