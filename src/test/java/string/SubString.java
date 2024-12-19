package string;

public class SubString {

	public static void main(String[] args) {

		String str="radhakrishnan";
		String s=str.substring(0, 2);

		String s1=str.substring(2);
		System.out.println(s1);
		System.out.println(s);
		
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
}
