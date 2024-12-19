package array;

import java.util.HashMap;
import java.util.Map;

public class New_Class {

	public static void main(String[] args) {
		
		String str="Prooggraming";
		// count o- g- p- r 
		// combinr ogpr
		String s=str.toLowerCase();
		char []ch=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				
			}
			else
				map.put(c,1);
		}
		
		char []c= {'o','g','p','r'};
		StringBuilder builder= new StringBuilder();
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			char m=entry.getKey();
			int a=entry.getValue();
			for(int i=0; i<a;i++) {
			if(entry.getKey().equals(c[i])) {
				
		builder.append(entry.getKey());
			
		
			}
			
			}
			
		}
		System.out.println(builder);
	}
}
