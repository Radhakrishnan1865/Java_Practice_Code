package string;

public class Reverse_Word {

	public static void main(String[] args) {
		
		String str="hi this is radhakrishnan";
		
		String[] s1=str.split(" ");
		
		String rev="";
		
		for(String s:s1) {
			
			String reverse="";
			for(int i=s.length()-1; i>=0; i--) {
				
				reverse=reverse+s.charAt(i);
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}
}
