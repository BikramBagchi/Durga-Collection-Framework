package VectorClass;

import java.util.Stack;
import java.util.Vector;

public class test0ne {

	public static void main(String[] args) {


		Vector ref = new Vector();
		
		ref.add("Ram");
		ref.add(10);
		ref.add(10.52);
		ref.add("Ram");//Duplicate are allow in vector class
		
		System.out.println(ref);
		
		ref.remove(1);
		
		//This method will remove 
		
		System.out.println(ref);
		
		
		ref.add(3, 56465);
		
		//this method is for add element at 3 position
		
		System.out.println(ref);
		
		int capacity = ref.capacity();
		
		//this method is for capacity
		
		System.out.println(capacity);

		int size = ref.size();
		
		// this method is for getting the size
		
		System.out.println(size);
		
		if (ref.isEmpty())
			//this method will ensure that the method is empty or not
		{
			System.out.println("IsEmpty");
		}
		else
		{
			System.out.println("IsNotEmpty");
		}
		
		System.out.println(ref.get(2));
		
		// this get method is to get the element
	
		
	}

}
