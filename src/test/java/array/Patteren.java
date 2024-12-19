package array;

public class Patteren {

	public static void main(String[] args) {
		
	
	
	int i,j,row=6;
		      for( i=1; i<row; i++) {
		    	  int p=1;
		    	  for(j=i; j<row; j++) {
		    		  
		    		  System.out.print(p++);
		    	  }
		    	  for(j=0;j<i; j++) {
		    		  System.out.print(p++);
		    	  }
		    	  for(j=0;j<=i;j++) {
		    		  
		    	  }
		    	  System.out.println();
		      }
	}
}
