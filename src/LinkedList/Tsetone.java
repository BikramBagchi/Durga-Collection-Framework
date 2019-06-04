package LinkedList;

import java.util.LinkedList;

public class Tsetone {

	public static void main(String[] args) {


		LinkedList test = new LinkedList();
		
		test.add("Ram");
		/*
		 In linklist we can give different types 
		 of data types 
		*/
		test.add('A');
		test.add(10);
		test.add(10.2569);
		test.add("74965464654");
		test.add("Ram");
		/*
		 Duplicate values can be added in linked list
		 */
		test.add(null);
		
		/*
		 null can be added in linklist
		 */
		
	    System.out.println(test);
	    
	    test.add(2, 45.23);
	    /*
	     It will add the object at position 2
	     */
	    
	    System.out.println(test);
	    
	    test.addFirst("First");
	    
	    /*
	     It will going to add first of the link list
	     */
	    
	    test.addLast("Last");
	    
	    /*
	     It will add value at the last of index 
	     */
	    
	    System.out.println(test);
	    
	    test.remove(2);
	    
	    /*
	     It will going to remove the index at 2
	     */

	    System.out.println(test);
	    
	    test.remove("First");
	    
	    /*
	     It will going to remove First
	     */
	    test.removeFirst();
	    /*
	     It will remove the first element
	     */
	    
	    test.removeLast();
	    /*
	     It will going to remove the last element
	     
	    */
	    
	    test.indexOf("74965464654");
	    /*
	     It will help to find the index of the element
	    */
	    
	    test.get(2);
	    
	    /*
	     It will help to get the object
	     */
	    
	    test.getFirst();
	    /*
	     Will get the first element
	     */
	    test.getLast();
	    /*
	     Will get the last element
	     */
	    
	    /*
	     When to use link list
	     
	     when we need to add or remove object in between link list then
	     we will going to use the link list
	     
	     So in one word link list overcome the drawback of array list
	     
	     */
	    /*
	     When to not use link list 
	     
	     When we need to retrieve object randomly or retrieve object frequently
	     Then we will not use linklist because it did not implements 
         random interface in it.
         
         So to overcome this drawback we will use we will use arraylist
	     */
	    
	}

}
