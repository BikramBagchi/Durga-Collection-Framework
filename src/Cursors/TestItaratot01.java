package Cursors;


import java.util.ArrayList;
import java.util.Iterator;

public class TestItaratot01 {

	public static void main(String[] args) {
		
		/*
		 Their are few limitation of Enumeration so to 
		 overcome them we use Iterators
		 */
        /*
         Iterator is applicable for all collection and it is a 
         universal cursors
         */
		
		ArrayList a = new ArrayList();
		
		for (int i = 0 ;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		
		Iterator k = a.iterator();
		
		while(k.hasNext())
		{
			Integer m = (Integer)k.next(); /*
			Integer m = (Integer) for type casting
			Here k.next will return in object and we want 
			the output as integer so to get that 
			we will do type casting
			*/
			
			
			if(m%2==0)//to get only the even number
			{
				System.out.println(m);
			}
			else
			{
				k.remove();// this is remove method present in Iterator
			}
		}
	
		/*
		 Limitation of Iterators
		 
		 Iterator is a single direction cursors that means we can only do
		 next but we can't do previous 
		 
		 in Iterator we can't do replace 
		 
		 addition of new object is not also possible
		 */
	}

}
