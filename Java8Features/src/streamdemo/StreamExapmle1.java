package streamdemo;
//Stream does not sotre any elements

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExapmle1 {

	public static void main(String[] args) {
		
		//Build an stream for array
		//we can only use wrapper objects
		Integer [] marks= {1,2,3,4,5,6,7};
		Stream<Integer> str=Stream.of(marks);
		str.forEach(i ->System.out.println(i));
		
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(34);
		grades.add(54);
		grades.add(16);
		grades.add(24);
		
		//Build an Stream for Collections
		Stream strm=grades.stream();
		strm.forEach(i ->System.out.println(i)); //or  strm.froEach(System.out::println);
		
		//for making stream to list
		List<Integer> squares=grades.stream().map(m->m*m).collect(Collectors.toList());
		System.out.println(squares);

	}

}
