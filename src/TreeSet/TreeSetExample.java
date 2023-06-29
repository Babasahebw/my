package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		//add the elements
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		
		//add the dublicate
		ts.add("A");
		System.out.println(ts);
		
		//getting the first value
		System.out.println("First Value is:-"+ts.first());
		System.out.println("Last Value is:-"+ts.last());
		
		
		//immediate elements
		String val="C";  //D //B
		
		System.out.println("Higher member:-"+ts.higher(val));
		System.out.println("Lower member:-"+ts.lower(val));
		
		// removing first and last ==> poll
		ts.pollLast();
		System.out.println(ts);
		// iterate
		Iterator itr = ts.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	
		
		
	}

}
