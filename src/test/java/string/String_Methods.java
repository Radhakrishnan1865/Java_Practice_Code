package string;

public class String_Methods {

	public static void main(String[] args) {
		
		String str="Radhakrishnan";
		char ch[]=str.toCharArray();
		String str1="radhakrishnan";
		
	int value=str.compareTo(str1);
	System.out.println(value);
	
	String s=str.concat(" " + str1);
	System.out.println(s);
	
boolean a=str.contentEquals("krishnan");
System.out.println(a);

String b=String.copyValueOf(ch);
System.out.println(b);

int hasValue=str.hashCode();
System.out.println(hasValue);

int val=str.lastIndexOf("a");
System.out.println(val);

String m=str.substring(5,12);
System.out.println(m);
	}
}
