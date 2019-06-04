package Cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class testListItrators01 {

	public static void main(String[] args) {
		
		/*
		 to over come the  limitation of both Iterators 
		 and Enumeration we use listitrators
		 
		 ListIterator is child child interface of Iterators
		 
		 */
		
		/*
		 We can move forward and backward using listitrators
		 it is bidirection 
		 
		 We can perform read , replace, remove, and addition 
		 of new activity
		 
		 */
		
        
		LinkedList l = new LinkedList();
		l.add("lal");
		l.add("bal");
		l.add("Pal");
		l.add("mal");
		l.add("bokachoda");
		
		System.out.println(l);
		
		ListIterator m = l.listIterator();
		
		while(m.hasNext())
		{
			String s = (String)m.next();
			if(s.equals("lal"))
			{
				m.remove();
			}
			else if (s.equals("bal"))
			{
				m.add("bol"); // addition of new element 
			}
			else if (s.equals("Pal"))
			{
				m.set("gandu"); // replace of element
			}
			/*
			 * else if (s.equals("Pal")) { int o = m.nextIndex(); 
			 * System.out.println("Value of next index" +o); }
			 * we can perform next index to get the next index value
			 */
		}
	
		System.out.println(l);
	       
		
		// we will perform previous from here
			LinkedList q = new LinkedList();
			l.add("lal");
			l.add("bal");
			l.add("Pal");
			l.add("mal");
			l.add("bokachoda");
			
	         ListIterator n = l.listIterator();
			
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
	
	}

}
