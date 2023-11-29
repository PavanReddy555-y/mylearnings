package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {
	
	public static <E> void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		
		// to add Elements into arrayList add()
		al.add(10);
		al.add("Java");
		al.add(1.05);
		al.add('p');
		al.add(null);
		System.out.println(al);// [10, Java, 1.05, p, null]
		
		// to add elements at specific index position
		
		al.add(1, 1);
		System.out.println(al);// [10, 1, Java, 1.05, p, null]
		
		// To add specific collection to another collection
		
		
		al1.add(al);
		System.out.println(al1);//[[10, 1, Java, 1.05, p, null]]
		
		// to add another colleection to another collection at specific index position
		
		al1.add(1, al);
		System.out.println(al1);//[[10, 1, Java, 1.05, p, null], [10, 1, Java, 1.05, p, null]]
		
		// to remove the elements
		
		al.remove(1);
		System.out.println(al.remove("pavan"));// false 
		System.out.println(al);//[10, Java, 1.05, p, null]
		
		
		// To remove specific collection from another collection
		
		al1.removeAll(al);
		System.out.println(al1);
		
		
		// To remove everything from arraylists
		
		
		//al1.clear();
		System.out.println(al1);// []
		
		System.out.println(al);//[10, 1, Java, 1.05, p, null]
		
		
		// To to check the presence of object
		
		System.out.println(al.contains('p')); //true
		
		// To check the presence of collection in another collection
		System.out.println(al1.contains(al)); // true
		System.out.println(al.contains(al1));// false
		
		// To check the index of  object  from the beginning
		
		System.out.println(al);//[10, Java, 1.05, p, null]
		System.out.println(al.indexOf("Java"));// 1
		
		System.out.println(al.lastIndexOf("Java"));
		
		
		
		
		
	}

}
