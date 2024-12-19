package string;

public class StringBuilder_Methods {

	public static void main(String[] args) {
		
		String str="Radhakr234124#!1*!#uhsa#!**(y98hd";
		
		String al=str.replaceAll("[^ a-zA-Z]", "");
		String nu=str.replaceAll("[^0-9]", "");
		String sp=str.replaceAll("[a-zA-Z0-9]", "");
		
		/*
		 * System.out.println(al); System.out.println(nu); System.out.println(sp);
		 */
		
		StringBuilder sb= new StringBuilder();
		StringBuilder sb1= new StringBuilder();
		StringBuilder sb2= new StringBuilder();
		
		for(char ch:str.toCharArray()) {
			
			if(Character.isDigit(ch)) {
				
				sb.append(ch);
			}
			else if(Character.isAlphabetic(ch)) {
				sb1.append(ch);
			}
			else
				sb2.append(ch);
		}
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
