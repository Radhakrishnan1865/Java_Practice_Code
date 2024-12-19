package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Radha","Krishnan","Arun","Rasul","Jothi","Valarmathi");
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}
