package collection;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		
			map.put(1, "radha");
			map.put(2,"krishnan");
			map.put(3,"kannan");
			
			
			for(Integer key:map.keySet()) {
				
				//map.get
			}
			/*
			 * for(Map.Entry<Integer,String> entry:map.entrySet()) {
			 * 
			 * int key=entry.getKey(); String value=entry.getValue();
			 * 
			 * System.out.println("Key is : " + key + "Value is : " + value); }
			 */
	}
}
