package CollectionOverview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Overview {

	public static void main(String[] args) {

      
		 int a[] = new int[3];
		 
		 int arraylength = a.length;
		 
		
		/*
		 The need of collection is to overcome the drawback of array
		 
		 int a[] = new int[3];
		 
		 here we can only enter three values because 
		 arraylength is 3
		 
		 To overcome this backlog we use collection framework
		  
		*/
		 
		 
		 /*
		  Collection Definition 
		  
		  if we want to represent a group of individual objects as 
		  a single entity then we should go for the collection
		  */
		 
		 
		 /*
		  Under collection Framework come 9 interface 
		  most need for test prospective are as 
		  List 
		  Queue
		  Set
		  Map (Though Map is not a child interface of collection)
		 */
		 
		 /*
		  No what is list 
		  
		  List interface contain few class and they are 
		  ArrayList
		  LinkList
		  Vector
		  Stack
		  
		  Where we going to use this list interface 
		  
		  When we can store duplicate values with insertion order 
		  we can understand it but taking a example of Arraylist
		  
		  */
		 
		  ArrayList b = new ArrayList();
		  b.add(01);
		  
		  /*
		   What is set
		   
		   it is same as list but in set we van't store duplicate values
		   and have no insertion order 
		   
		   Such example are as HashSet and LinkedHashSet
		   and we have one sorted set that is treeset
		   		   
		   */
		  
		  HashSet c = new HashSet();
		  c.add(10);
		  c.add("Ram");
		
		  TreeSet d = new TreeSet();
		  d.add("Japan");
		  d.add("PAgol");
		  
		  /*
		   What queue 
		   
		   can understand with an example 
		   
		    like we have to send mail to all number of user
		    so for that we will use  queue because we have to 
		    store all the mail before we have to send all 
		    the mail. So to store all the values before before we send or do anything
		    we will use this concept of queue
		   
		   */
		  
		  /*
		   What is Map interface 
		   
		   Here we can add values and keys
		   Where values can be duplicate but keys can't be 
		   duplicate
		   
		   For sorted map we have treemap 
		   */
		  
	
		  
		  
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
        
	}

}
