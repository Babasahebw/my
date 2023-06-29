package LinkHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
	
public static void main(String[] args) {
	//creating Linked hashset
	LinkedHashSet lhs=new LinkedHashSet();
	
	
	//to add elements
	
	lhs.add("A");
	lhs.add("B");
	lhs.add("C");
	lhs.add("G");
	lhs.add("E");
	lhs.add("1");
	
	
	//TRY TO ADD the dulicate
	
	lhs.add("2");
	lhs.add("E");
	System.out.println(lhs);
	
	System.out.println("the size is:-"+lhs.size());
	System.out.println("check the present element:-"+lhs.contains("A"));
	
	lhs.remove("E");
	System.out.println(lhs);
	
	System.out.println(lhs.remove("1"));
	System.out.println(lhs);
	
	System.out.println(lhs.remove("Z"));
	System.out.println(lhs);
	
	//iterator
	
	Iterator itr=lhs.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
}

}
