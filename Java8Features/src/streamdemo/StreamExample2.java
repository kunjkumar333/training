package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("john","sammmy");
		Stream<String> n=names.stream();
		
		Stream<String> ln=n.filter(str->str.length()>3);
		ln.forEach(System.out::println);
		
		System.out.println("**************");
		
		//pipelining
		//Create a stream -->Operation-->stream to collection
		List<String> names1=names.stream().filter(str->str.length()>4).collect(Collectors.toList());
		
		System.out.println(names1);
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(39);
		grades.add(54);
		grades.add(16);
		grades.add(24);
		
		//Build stram from Collections
		Stream<Integer> strm1=grades.stream();
		
		//Filter only even Grades
		List<Integer> gradesEven=strm1.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(gradesEven);
		

	}

}
