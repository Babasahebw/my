package LinkList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
	public static void main(String [] args) {
		LinkedList ll=new LinkedList();
		
		ll.add(15);
		ll.add("ABC");
		ll.add('A');
		ll.add(25);
		
		System.out.println(ll);
		
		//Modifying Arraylist
		
		ll.add(2,'B');
		System.out.println(ll);
		
		//data remove
		ll.remove(4);
		System.out.println(ll);
		
		ll.add(null);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		
		ll.addFirst("30th April");
		ll.addLast("mauli");
		
		System.out.println(ll);
		
	
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		//emptiness
		System.out.println(ll.isEmpty());
		
		//size
		System.out.println(ll.size());
		
		//location of information
		System.out.println(ll.indexOf(15));
		
		//contains
		System.out.println(ll.contains('A'));
		
		//get
		System.out.println(ll.get(1));
		System.out.println(ll.get(3));
		
		//to read arraylist
		//simple for looped
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		//Advanced for looped
		System.out.println();	
		for(Object value:ll) {
			System.out.print(value+" ");
		}
		//Ietrator
		System.out.println();
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		//ListIterator
		ListIterator litr=ll.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
			}
		
		
		System.out.println();
		//reverse order
		Collections.reverse(ll);
		System.out.println(ll);
		
		
	}

		

}
