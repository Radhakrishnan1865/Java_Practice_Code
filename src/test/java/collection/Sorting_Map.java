package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sorting_Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<>();
		map.put("Radha", 29);
		map.put("Kannan", 27);
		map.put("Arun", 07);
		map.put("Jothi",31);
		map.put("Aruna", 26);
		
		
		List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		Map<String,Integer> sortedmap= new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry: list) {
			
			if(entry.getKey().equals("Radha")) {
				entry.setValue(27);
			}
			sortedmap.put(entry.getKey(), entry.getValue());
			
			
		}
		System.out.println(sortedmap);
	}
}
