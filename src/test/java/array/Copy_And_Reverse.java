package array;

import java.util.Arrays;

public class Copy_And_Reverse {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5};
		
		int []b= new int[a.length];
		
		for(int i=0, j=a.length-1; i<a.length; i++, j--) {			
			b[j]=a[i];
		}
		System.out.println("Before copy and reverse : "+ Arrays.toString(a));
		System.out.println("After copy and reverse : "+ Arrays.toString(b));
	}
}
