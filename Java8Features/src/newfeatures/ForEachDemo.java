package newfeatures;

import java.util.ArrayList;
import java.util.*;

/* 
 Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can iterate 
 over the elements in the collection.“forEach” is a default method defined
  in the Iterable interface. It is used by the Collection classes that extend the Iterable interface to iterate elements.
 The “forEach” method takes the Functional Interface as a single
  parameter i.e. you can pass Lambda Expression as an argument.
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> languages=new ArrayList<Integer>();
		languages.add(1);
		languages.add(2);
		languages.add(3);
		languages.add(4);
		languages.add(5);
		
		System.out.println("***Programing Lnaguages***");
		//languages.forEach(i -> System.out.println(i));
		languages.forEach(System.out::println);
		
		//declare a map of customer map
		Map<Integer,String> customer=new HashMap<Integer,String>();
		customer.put(101, "miky");
		customer.put(102, "alex");
		customer.put(103, "lucky");
		customer.put(104, "james");
		customer.put(105, "tom");
		
		System.out.println("****** Customer Accont details*****");
		
		
	    customer.forEach((k,v) -> System.out.println("customer_id :"+k+" "+"customer_name:"+v));
	    
	    //decalring arraylist
	    List<Integer> arr=new ArrayList<Integer>();
	    arr.add(1);
	    arr.add(2);
	    arr.add(3);
	    
	    arr.forEach(i -> System.out.println(i));
	    
	    
		
		
	}

}
