package Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class testListItrators02 {

	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		q.add("lal");
		q.add("bal");
		q.add("Pal");
		q.add("mal");
		q.add("bokachoda");
		
         ListIterator n = q.listIterator();
		
		while(n.hasPrevious())
		{
			String t = (String)n.previous();
			if(t.equals("lal"))
			{
				n.remove();
			}
			else if (t.equals("bal"))
			{
				n.add("bol"); // addition of new element 
			}
			else if (t.equals("Pal"))
			{
				n.set("gandu"); // replace of element
			}
			/*
			 * else if (s.equals("Pal")) { int o = m.nextIndex(); 
			 * System.out.println("Value of next index" +o); }
			 * we can perform next index to get the next index value
			 */
			
			System.out.println(q);

	}
      /*
       ListIterator only applicable for list interface 
       so it is not a universal operator
       */
	}
	
}
