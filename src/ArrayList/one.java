package ArrayList;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class one {

	public static void main(String[] args) {
		System.out.println("Jani dakha hobe");

	
		/*
		 Resizeable array or Growable array
		 Duplicate value can be enter
		 Insertion order
		 Different type of object (Heterogeneous)
		 Null insertion are possible
		 Initial capacity of array list is 10
		 Once it increase the the capacity will become = (current capacity *3/2)+1
		 		 
		*/
		
		/*
		 Three important CONSTRUCTOR of arraylist class 
		 1)ArrayList d = new ArrayList(); 
		 This will call the default constructor
		 with initial size as 10 and gradually it will increase as
		 capacity will become = (current capacity *3/2)+1.
		 
		 2) Now every time if the same growable calculation 
		 (capacity will become = (current capacity *3/2)+1.) is going on 
		 then our performance will go down so to overcome this we use 
		 second constructor.
		   ArrayList d = new ArrayList(int INTIALCAPACITY); 
		   Here we will pre define our need of how much length we need 
		   to overcome the performance issue 
		 
		 3) ArrayList d = new ArrayList(Collection c); 
		  This constructor will help to store the values of 
		  and set or queues or map in Arraylist
		 */
		
		ArrayList test = new ArrayList();
		
		test.add("Ram"); //add method is adding values in arraylist
		test.add(123456);
		test.add(10.256);
		test.add('A');
		test.add("Ram");//Duplicate values are allow
				
		System.out.println(test);
		
		int index_value = test.indexOf("Ram");//It will give us the index value of Ram
		System.out.println(index_value);
		
		int last_index_value = test.lastIndexOf("Ram");//Last index values of the object
		System.out.println(last_index_value);
		
        if (test.contains('A'))// it will check whether my arraylist contain A or not
        {
        	System.out.println("Jio Pagla");
        	
        }
        else 
        {
        	System.out.println("Hobe na ");
        }
        
        test.remove("Ram"); // this method will remove Ram which come at top
        
        System.out.println(test);
        
        test.remove(1);//This method will delete the object in index 1
        test.add(1, 55236); // This method will going to add element at index 1
        test.add(null);//it can take null as well
        test.add(1, 2526);/* it will get enter in element 1 and element 1 will 
        move to 2 and so on this is a drawback of array list.
        */
        System.out.println(test);
        
        int size = test.size();
        
        for (int i = 0; i<= size ; i++)
        {
        	System.out.println(test.get(i));
        	/* 
        	  get method is to get a particular element 
        	  at assign index
        	*/
        }
 
        
        ArrayList Test25 = new ArrayList(100);// hEre I am defining the size of the array list as 100
        
        /*
         to access any element randomly array list and vector list 
         implements random access
         
         */
        /*
         When to use array list 
         
         when we have to retrieve element frequently then only we should use array list
         because array list ands vector list both implements Random Access (Interfaces)
            
         */
        
        /*
         When we should' t use the array list 
         
         if we add in index 1 once the array list created with values
         then the pre define index 1 object will move to index 2 and so as index 2
         will move to index 3 this is a cause of performance issue.
         
         If we want to remove index 2 object, once it get remove the index 3 object 
         will become index 2 and index 4 will become index 3 this will also create 
         performance issue
         */
        
        
        ArrayList Test30 = new ArrayList();
        
        List Test31 = (List) Collections.synchronizedList(Test30);
        
        
        
        		
	}

	
	
}
