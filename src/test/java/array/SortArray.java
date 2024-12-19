package array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int []a={20,10,34,545,90,9,1,2131};
	      int temp=0;
	        
	        int len=a.length;
	      for(int i=0; i<len; i++){
	          
	          for(int j=i+1; j<len; j++){
	              
	              if(a[i]>a[j]){
	                  temp=a[i];
	                  a[i]=a[j];
	                  a[j]=temp;
	                  
	              }
	          }
	         	      }
	      System.out.print(Arrays.toString(a));

	      System.out.println();
	      
	        // using Bubble sort method
	      int []b= {23,453,5465,87,9,234,902,12};
	      
	      int length=b.length;	
	      
	      for(int i=0;i<length-1;i++) {
	    	  for(int j=0;j<length-1-i;j++) {
	    		  
	    		  if(b[j]>b[j+1]) {
	    			  
	    			  int tem=b[j];
	    			  b[j]=b[j+1];
	    			  b[j+1]=tem;
	    		  }
	    		  
	    	  }
	      }
	     System.out.println(Arrays.toString(b));
	}
}
