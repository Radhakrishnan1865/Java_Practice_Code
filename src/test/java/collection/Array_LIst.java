package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Array_LIst {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Radha");
		list.add("Kannan");
		list.add("Arun");
		list.add("Jothi");
		
		//Collections.sort(list);
		//list.sort(Comparator.naturalOrder());
		list.sort(Comparator.reverseOrder());
		List<String> alist=new ArrayList<>();
		alist.addAll(list); // using addAll method to copy element one list into another list
		System.out.println(alist);
		
		
		
		Iterator<String> iterator=list.listIterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
			//list.add("Valarmathi");
		}
	}
}
