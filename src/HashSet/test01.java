package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class test01 {

	public static void main(String[] args) {
		
		/*
		 Hash set 
		 
		 we can't have duplicate value and no insertion permeative
		 
		 we will use hash set when we need to search any object
		 */
		
		/*
		 
		 Their are 4 constructor in hash set
		 
		 1)HashSet v = new HashSet(); with initial value as 16 and fill ratio 0:75
		 
		 now what is fill ration - once the HashSet is fill by 75% it will again
		 increase the capacity of HashSet.
		 
		 2) HashSet v = new HashSet(1000); it will create HashSet of capacity
		 1000
		 
		 3)HashSet v = new HashSet(1000,65); it will create capacity of 1000 and 
		 fill ration as 0:65
		 
		 4)HashSet v = new HashSet(collection c);
		 
		 */
		
        ArrayList test = new ArrayList();
		
		test.add("Ram"); //add method is adding values in arraylist
		test.add(123456);
		test.add(10.256);
		test.add('A');
		test.add("Ram");//Duplicate values are allow
		test.add(null);
		
		HashSet v = new HashSet(test);
		
		/*
		 IN HashSet RAM WILL C0ME ONE AT THE TIME OUTPUT BECAUSE DUPLICATE IS NOT ALLOW 
		 
		 and the output will not come according to our insertion order as set is not 
		 Insertion permeative
		 
		 */
		
		System.out.println(v);
		
		/*
		 LinkedHashMap m = new LinkedHashMap();
		 
		 In LinkedHashMap we will only have insertion order preserve and all other 
		 are same like HashMap
		 		 
		 */
		
	
		
		
		
		
	

}

}
