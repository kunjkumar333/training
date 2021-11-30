package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExapmle5 {
	
	public static void main(String[] args) {
		
		//even number in list
		Stream<Integer> evenInfiniteStream=Stream.iterate(0,n->n+2);
		List<Integer> evenNumber=evenInfiniteStream.limit(20).collect(Collectors.toList());
		System.out.println("20 even numbers from 0 is: "+evenNumber);
		
		System.out.println("****************************************");
		
		//odd numbers in set
        Stream<Integer> oddInfiniteStream=Stream.iterate(1,n->n+2);
		Set<Integer> oddNumber=oddInfiniteStream.limit(20).collect(Collectors.toSet());
		System.out.println("20 odd numbers from 1 is: "+oddNumber);
		
		System.out.println("****************************************");
		
		//skip(n)>>it will first n elements 
		Stream<Integer> evenInfiniteStream1=Stream.iterate(0,n->n+2);
		List<Integer> evenNumber1=evenInfiniteStream1.skip(4).limit(20).collect(Collectors.toList());
		System.out.println("20 even numbers from 0 is: "+evenNumber1);
		
		System.out.println("****************************************");
		
		//distinct element from stream to list
		List<String>  branch=Arrays.asList("Cs","Ece","ME","Civil","IT","Cs");
		List<String> distinctBranch=branch.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct Branch are : "+distinctBranch);
		
		System.out.println("****************************************");
		
		//anyMatch()>>>check if any match in list is exist or not
		boolean match=branch.stream().anyMatch(i->i.contains("Cs"));
		System.out.println("is there any match of Cs :"+match);
		
		
	}

}
