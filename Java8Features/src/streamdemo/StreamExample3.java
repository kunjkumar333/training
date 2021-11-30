package streamdemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample3 {

	public static void main(String[] args) {

		
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("******sorting***********");
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        List<String> convrtToList=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(convrtToList);
        
        System.out.println("****counting");
        long cnt=names.stream().count();
        System.out.println("No of Elements : "+cnt);
        
        long cnt1=names.stream().filter((s)->s.startsWith("A")).count();
        System.out.println("No. of Names starting with A: "+cnt1);
        
        //reduce Operation
        Optional<String> red=names.stream().reduce((s1,s2) ->s1+"#"+s2);
        red.ifPresent(System.out::println);
        //System.out.println(red);
        
        //sum of array
        Integer [] marks= {1,2,3,4,5,6,6};
        int sum=Arrays.stream(marks).reduce(0,(a,b)->a+b);
        System.out.println("sum is :"+sum);
        
        //Display numbers from 1 to 100 using stream
        IntStream.range(1, 101).forEach(System.out::println);
	}

}
