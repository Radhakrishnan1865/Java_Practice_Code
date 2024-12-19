package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Array_List_Multithread {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("Radha");
		list.add("Kannan");
		list.add("Arun");
		list.add("Jothi");
		
		CopyOnWriteArrayList<String> alist= new CopyOnWriteArrayList<>();
		alist.addAll(list);
		
		for(String name:alist) {
			alist.add("Valarmathi");
			System.out.println(name);
			
		}
	}
}
