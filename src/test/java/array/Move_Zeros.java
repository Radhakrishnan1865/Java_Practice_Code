package array;

public class Move_Zeros {

	public static void main(String[] args) {
		
		int []array= {1,4,0,5,0,9,0,0,1,3,0};
		
		int non_ZeroIndeex=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]!=0) {
				
				array[non_ZeroIndeex++]=array[i];
			}
		}
		while(non_ZeroIndeex<array.length) {
			array[non_ZeroIndeex++]=0;
		}
		for(int num:array) {
		System.out.print(num+",");
	}
	}
}
