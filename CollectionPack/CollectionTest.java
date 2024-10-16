package CollectionPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		List list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("Java");
		list.add(3.7);
		System.out.println(list);
		
		
		List list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add("Java");
		list1.add("JSP");
		list1.add(3.7);
		System.out.println(list1);
		
		Set set=new HashSet();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add("Java");
		set.add("JSP");
		set.add(3.7);
		System.out.println(set);

		Set set2=new TreeSet();  // requires same type of data
//		set2.add(1);
//		set2.add(2);
//		set2.add(3);
		set2.add("Java");
		set2.add("JSP");
		set2.add("Hibernate");
//		set2.add(3.7);
		System.out.println(set2);

	}

}
