package string;

import java.util.Arrays;

public class String_To_Array {

	public static void main(String[] args) {
		
		char[] ch= {'R','a','d','h','a','k','r','i','s','h','n','a','n'};
		
		// 01 Using String constructor
		String str= new String(ch);
		System.out.println(str);
		
		// 02 Using ValueOf method
		String s=String.valueOf(ch);
		System.out.println(s);
		
		// 03 Using copyValueOf method
		String s1=String.copyValueOf(ch);
		System.out.println(s1);
		
		// 04 Using StringBuffer or StringBuilder
		StringBuilder sb= new StringBuilder();
		for(char c:ch) {
		sb.append(c);
		
		}
		System.out.println(sb);
		
		// 05 Using Arrays.toString method
		String s2=Arrays.toString(ch);
		System.out.println(s2);
	}
}
