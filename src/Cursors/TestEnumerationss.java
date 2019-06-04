package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumerationss {

	public static void main(String[] args) {
		
		/*
		 Enumeration is only applicable for legacy class(It is not
         applicable for array list) and not a universal class.
         
         Enumeration is only for readable and not for remove
		 */
		Vector v = new Vector();
		
		for(int i=0;i<=10;i++)
		{
			v.add(i);
			
		}
		
		System.out.println(v);
				
		Enumeration r = v.elements();
		
		while (r.hasMoreElements())
		{
			int m = (Integer)r.nextElement();
			System.out.println(m);
		}
		
	}

}
