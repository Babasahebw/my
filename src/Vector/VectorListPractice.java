package Vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorListPractice {
	public static void main(String [] args) {
		Vector vec=new Vector();
		//add the elements
		vec.add('A');
		vec.add("PQR");
		vec.add(2);
		vec.add("Delhi");
		vec.add("Pune");
		vec.add(5000);
		
		
		System.out.println(vec);
		System.out.println(vec.capacity());
		
	    vec.set(3, "XYZ");
	    System.out.println(vec);
	    
	    vec.remove(5);
	    System.out.println(vec);
	    
	    System.out.println("Checking the emptiness:-"+ vec.isEmpty());
	    System.out.println("Checking the size:-"+ vec.size());
	    System.out.println("The index of A:-"+ vec.indexOf('A'));
	    System.out.println("Contain Methods:-"+vec.contains("XYZ"));
	    System.out.println("To check the index:-"+vec.get(1));
		
	    
	    Iterator itr=vec.iterator();
	    while(itr.hasNext()) {
	    	System.out.print(itr.next()+" ");
	    	
	    }
	    System.out.println();
		Enumeration en=vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println();
		ListIterator litr=vec.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		Collections.reverse(vec);
		System.out.println(vec);
		
		
	}


}
