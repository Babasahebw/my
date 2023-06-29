package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistNumberProgram {
         public static void main(String[] args) {
		
		// Arraylist declartion.
		
		ArrayList <Integer> num =new ArrayList <Integer>();
		ArrayList <String> str =new ArrayList <String>();
		
		// adding values.
		
		num.add(19);
		num.add(16);
		num.add(181);
		num.add(170);
		num.add(89);
		num.add(211);
		num.add(856);
		num.add(105);
		
		
		str.add("30 April");
		str.add("Batch");
		
		System.out.println("Arraylist before sorting "+ num);
		
		// sort the arraylist in aescending order
		
		Collections.sort(num);
		System.out.println("Arraylist after sorting "+ num);
		
		// sort the arraylist in descending order
		
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("Arraylist after sorting "+ num);
		
	}
	
	


}
